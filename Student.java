/* 
 * Student number : 2422647
 * CSCU9A3
 * version: November2016
 */
package assignment2016UniPeopleManagementQUESTION;

/**
 * Student class inherits the Person class
 * 
 * @author user
 *
 */
public class Student extends Person {

	/**
	 * variables for the year of study and the course of the student
	 */
	private int yearOfStudy;
	private String course;

	/**
	 * constructor about the name, age, year of study and course for the student
	 * super() constructor with parameters inherited from the parent class
	 * 
	 * @param name
	 * @param age
	 * @param yearOS
	 * @param c
	 *            course of the student
	 */
	Student(String name, int age, int yearOS, String c) {
		super(name, age);
		setYearOfStudy(yearOS);
		setCourse(c);
	}

	/**
	 * sets the course of study of the student if bad input terminates the
	 * program
	 * 
	 * @param c
	 */
	public void setCourse(String c) {
		if (verifyWords(c)) {
			course = c;
		}

	}

	/**
	 * gets the name of the student's course
	 * 
	 * @return the name of the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * sets the study year of the student if bad input terminates the program
	 * 
	 * @param y
	 */
	public void setYearOfStudy(int y) {
		if (y < 0 || y > 4) {
			System.out.println("You have input a wrong study year");
			System.exit(0);
		} else {
			yearOfStudy = y;
		}
	}

	/**
	 * gets the study year
	 * 
	 * @return the year of study
	 */
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	/**
	 * toString() also prints all the information about the student
	 */
	public String toString() {
		return getName() + " " + getAge() + " " + getID() + " " + getYearOfStudy() + " " + getCourse();
	}

}
