/* 
 * Student number : 2422647
 * CSCU9A3
 * version: November2016
 */
package assignment2016UniPeopleManagementQUESTION;

/**
 * Lecturer class inherits the Person class
 * 
 * @author user
 *
 */
public class Lecturer extends Person {

	/**
	 * variable for the department
	 */
	private String department;

	/**
	 * constructor for name, age and department of the lecturer using the
	 * super() constructor with parameters inherited from the parent class
	 * 
	 * @param name
	 * @param age
	 * @param department
	 */
	Lecturer(String name, int age, String department) {
		super(name, age);
		setDepartment(department);
	}

	/**
	 * method to see the department of the lecturer if bad input terminates the
	 * program
	 * 
	 * @return the name of the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * method to set the department of the lecturer
	 * 
	 * @param dep
	 */
	public void setDepartment(String dep) {
		if (verifyWords(dep)) {
			department = dep;
		}

	}

	/**
	 * method toString() also to print out the information about the Lectuter
	 */
	public String toString() {
		return getName() + " " + getAge() + " " + getID() + " " + getDepartment();
	}

}
