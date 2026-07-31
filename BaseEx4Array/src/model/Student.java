package model;

public class Student {

	private String firstName = "";
	private String lastName = "";
	private Grades grades;

	/* Constructor */
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = new Grades();
	}

	/*FirstName Getter
	 * @return : firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/*LastName Getter
	 * @return : lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/*Grades Getter
	 * @return : grades
	 */
	public Grades getGrades() {
		return grades;
	}
}
