/* 
 * Student number : 2422647
 * CSCU9A3
 * version: November2016
 */
package assignment2016UniPeopleManagementQUESTION;

/**
 * Administrator class inherits the Person class
 * 
 * @author user
 *
 */
public class Administrator extends Person {

	/**
	 * variable for the jobtitle
	 */
	private String jobtitle;

	/**
	 * constructor for the name, age and the jobtitle of the person super()
	 * constructor with parameters inherited from the parent class
	 * 
	 * @param name
	 * @param age
	 * @param jobtitle
	 */
	Administrator(String name, int age, String jobtitle) {
		super(name, age);
		setJobtitle(jobtitle);
	}

	/**
	 * method to see the jobtitle of the person if bad input terminates the
	 * program
	 * 
	 * @return the jobtitle of the person
	 */
	public String getJobtitle() {
		return jobtitle;
	}

	/**
	 * method to set the job of the person
	 * 
	 * @param jt
	 */
	public void setJobtitle(String jt) {
		if (verifyWords(jt)) {
			jobtitle = jt;
		}

	}

	/**
	 * method toString() and to print out the information about that
	 * administrator
	 */
	public String toString() {
		return getName() + " " + getAge() + " " + getID() + " " + getJobtitle();
	}

}
