import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;



public class BaseEx4ArrayApplication {

	//---------------------------------Methods----------------------------------------------

	/*
	 * Question to ask the user for student registration
	 * @param : Scanner -> to record the response
	 * @return : answerRecord -> the response given
	 */
	private static String questionRecordStudent(Scanner scan) {
		String answerRecord;
		do {

			System.out.println("Souhaitez vous enregistrer un élève?");
			answerRecord = scan.nextLine();

		} while(!answerRecord.equalsIgnoreCase("non") &&
				!answerRecord.equalsIgnoreCase("oui") &&
				!answerRecord.equalsIgnoreCase("o") &&
				!answerRecord.equalsIgnoreCase("n"));
		return answerRecord;
	}

	/*
	 * Method to record one student
	 * @param : Scanner -> to record the responses
	 * @return : student -> student added
	 */
	private static Student recordStudent(Scanner scan) {
		String firstname;
		String lastname;
		System.out.println("Prénom de l'élève :");
		firstname = scan.nextLine().toUpperCase();

		System.out.println("Nom de l'élève :");
		lastname = scan.nextLine().toUpperCase();

		Student student = new Student(firstname, lastname);
		return student;
	}

	/*
	 * Question to ask the user for saving notes 
	 * @param : Scanner -> to record the response
	 * @return : answerGrade -> the response given
	 */
	private static String questionRecordGrade(Scanner scan) {
		String answerGrade;
		do {

			System.out.println("Souhaitez vous enregistrer une note?");
			answerGrade = scan.nextLine();

		} while(!answerGrade.equalsIgnoreCase("non") &&
				!answerGrade.equalsIgnoreCase("oui") &&
				!answerGrade.equalsIgnoreCase("o") &&
				!answerGrade.equalsIgnoreCase("n"));
		return answerGrade;
	}

	/*
	 * Method to record one grade
	 * @param : Scanner -> to record the response
	 * @param : Student -> to record the grades in student object
	 */
	private static void recordGrade(Scanner scan, Student student) {
		String dataEntry = "";
		double grade;
		do {
		System.out.println("Saisissez une note (pour les notes décimales, utilisez un '.' :");
		grade = scan.nextDouble();
		} while (!dataEntry.matches("\\d+(\\.\\d+)?"));
		student.getGrades().addGrade(grade);
		scan.nextLine();
	}

	/*
	 * Entry Point
	 */
	public static void main(String[] args) {

		// -------------------------------Variables--------------------------------------------
		Scanner scan = new Scanner(System.in);
		Student student;
		List<Student> students = new ArrayList<>();
		String answerRecord ="";
		String answerGrade ="";
		String fullname = "";
		// ------------------------------------------------------------------------------------

		System.out.println("Bienvenue dans l'application de gestion des élèves." );
		// students records
		do {
			answerRecord = questionRecordStudent(scan);

			if (answerRecord.equalsIgnoreCase("oui") || answerRecord.equalsIgnoreCase("o")) {
				student = recordStudent(scan);

				do {
					answerGrade = questionRecordGrade(scan);

					if (answerGrade.equalsIgnoreCase("oui") ||
							answerGrade.equalsIgnoreCase("o")) {

						recordGrade(scan, student);

					} else {
						System.out.println("Fin des enregistrements des notes");
					}

				} while(answerGrade.equalsIgnoreCase("oui") || answerGrade.equalsIgnoreCase("o"));

				students.add(student);

			} else {
				System.out.println("Fin de l'enregistrement des élèves.");
			}
		} while(answerRecord.equalsIgnoreCase("oui") || answerRecord.equalsIgnoreCase("o"));

		// affiche pour chaque étudiant prénom, nom et moyenne
		for (Student addedStudent : students) {
			System.out.println(addedStudent.getFirstName() + " " + addedStudent.getLastName() + " : ");
			System.out.println("Sa moyenne : " + addedStudent.getGrades().calculationOfTheAverage(addedStudent.getGrades()));
		}

		// Saisir le nom d'un élève et vérifier si existe dans la liste -> s'il existe afficher notes et moyenne -> sinon message "n'existe pas"
		System.out.println("Saisissez le nom d'un élève (prenom + nom) :");
		fullname = scan.nextLine().toUpperCase();
		boolean isFound = false;
		for (Student addedStudent : students) {

			if (fullname.equalsIgnoreCase(addedStudent.getFirstName()+ " " + addedStudent.getLastName())) {
				isFound = true;
				System.out.println("Pour l'élève : " +addedStudent.getFirstName() + " " + addedStudent.getLastName() + " : ");
				System.out.println("Ses notes : " + addedStudent.getGrades().displayGrades());
				System.out.println("Sa moyenne : " + addedStudent.getGrades().calculationOfTheAverage(addedStudent.getGrades()));
			}
		}
		if (!isFound) {
			System.out.println("L'élève recherché ne fait pas partie de la classe.");
		}
		
		//affiche la liste en tri alphabétique inversé sur les prénoms
		
		students.sort((student1, student2) -> student2.getFirstName().compareTo(student1.getFirstName()));
		System.out.println("La liste des prénoms des étudiants par tri alphabetique inversé est : ");
		for (Student addedStudent :students ) {
			System.out.print(addedStudent.getFirstName());
			System.out.println("\n");
		}
		
		//affiche la liste en tri alphabétique sur les prénoms
		
		students.sort((student1, student2) -> student1.getFirstName().compareTo(student2.getFirstName()));
		System.out.println("La liste des prénoms des étudiants par tri alphabetique est : ");
		for (Student addedStudent :students ) {
			System.out.print(addedStudent.getFirstName());
			System.out.println("\n");
		}
		
		scan.close();
		System.out.println("Fin du programme");
		System.out.println();
	}
}
