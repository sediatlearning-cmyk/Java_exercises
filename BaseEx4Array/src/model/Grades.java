package model;
import java.util.ArrayList;
import java.util.List;

public class Grades {

	// ------------------------------Variables------------------------------------
	private List<Grade> grades = null;

	// ------------------------------Methods--------------------------------------

	/* Constructor */
	public Grades(){
		grades = new ArrayList<Grade>();
	}

	/*Getter*/
	public List<Grade> getGrades() {
		return grades;
	}

	/* Add grade in arrayList Grades
	 * @param : grade -> grade to add
	 * @return : grades -> arrayList of grades
	 */
	public void addGrade(double grade) {
		grades.add(new Grade(grade));
	}
	
	/* displayGrades method is a method that adds the grades in a StringBuilder object and which convert this object in String with toString() method
	 * @return : result -> a string containing all the notes
	 */
	public String displayGrades(){
		StringBuilder stringBuilder = new StringBuilder();
		for(Grade grade : grades) {
			stringBuilder.append(grade.getValue()).append(", ");	
		}
		String result = stringBuilder.toString();
		return result;
	}
	
	/* Calculation of the average of the grades stored in the grades array 
	 * @param : grades -> arrayList of grades
	 * @return : average -> average score
	 */
	public Double calculationOfTheAverage(Grades grades) {
		double average = 0;
		double sum = 0;
		for(Grade grade : grades.getGrades()) {
			sum += grade.getValue();
		}
		average = sum / grades.getGrades().size();
		average = Math.round(average * 100) / 100;
		return average;
	}
	/* Find the lowest grade of the grades stored in the grades array 
	 * @param : grades -> arrayList of grades
	 * @return : lowestGrade -> lowest grade
	 */
	public static Double findTheLowestGrade(Grades grades) {
		double lowestGrade = 20;

		for (Grade grade : grades.getGrades()) {
			if (grade.getValue() < lowestGrade) {
				lowestGrade = grade.getValue();
			}
		}
		return lowestGrade;
	}
	/* Find the greatest grade of the grades stored in the grades array 
	 * @param : grades -> arrayList of grades
	 * @return : greatestGrade -> greatest grade
	 */
	public static Double findTheGreatestGrade(Grades grades) {
		double greatestGrade = 0;

		for (Grade grade : grades.getGrades()) {
			if (grade.getValue() > greatestGrade) {
				greatestGrade = grade.getValue();
			}
		}
		return greatestGrade;
	}
}
