
package assignment2016UniPeopleManagementQUESTION;

/**
 * The abstract class Person inherits the Comparable class which enables easier
 * comparing between two objects such as Person objects
 * 
 * @author user
 *
 */
public abstract class Person implements Comparable<Person> {

	/**
	 * variables for age, name, and ID of the person
	 */
	private int age;
	private String name;
	private int id;
	private static int indicator = 0;

	/**
	 * constructor to give name, age and creates an ID
	 * 
	 * @param n
	 * @param a
	 */
	Person(String n, int a) {

		setName(n);
		setAge(a);
		id = indicator;
		indicator++;

	}

	/**
	 * method to verify if there is a word if incorrect input terminates the
	 * program (used only in complex problems, or for 'close button', but I
	 * think it's better for a small program like this one rather then going for
	 * try and catch). The 0 is used at random for this case. It doesn't have
	 * any other meaning than being an integer
	 * 
	 * @param n
	 * @return true if the input is possible and enables it to be stored into
	 *         the variable
	 */
	protected boolean verifyWords(String n) {
		if (n == null) {
			System.out.println("You can't have a null value ");
			System.exit(0);
		} else if (n.equals("")) {
			System.out.println(
					"There is no input in one or more of the strigs check the :Name, Course, Department or Jobtitle ");
			System.exit(0);
		}
		return true;
	}

	/**
	 * method to set the name of the person
	 * 
	 * @param n
	 */
	public void setName(String n) {
		if (verifyWords(n)) {
			name = n;
		}

	}

	/**
	 * method to set the age of the person if incorrect input terminates the
	 * program
	 * 
	 * @param a
	 */
	public void setAge(int a) {
		if (a < 0 || a > 120) {
			System.out.println("Only humans can be in the University and they can't have that age!");
			System.exit(0);
		} else {
			age = a;
		}
	}

	/**
	 * method to get the name of the person
	 * 
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to get the age of the person
	 * 
	 * @return the age of the person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * method to get the ID of the person
	 * 
	 * @return the ID of the person
	 */
	public int getID() {
		return id;
	}

	/**
	 * method to reset the ID of the person initializes the indicator variable
	 * back to 0
	 */
	public static void resetID() {
		indicator = 0;
	}

	/**
	 * method toString() also to print the name, age and ID, if needed
	 */
	public String toString() {
		return getName() + getAge() + getID();
	}

	/**
	 * method to compare two people's names in order to put them in the right
	 * places in the binary tree
	 */
	public int compareTo(Person p) {
		int x = this.getName().compareTo(p.getName());
		return x;
	}
}
