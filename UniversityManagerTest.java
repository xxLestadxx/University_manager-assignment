
package assignment2016UniPeopleManagementQUESTION;

import java.util.ArrayList;

public class UniversityManagerTest {

	/**
	 * creates a static object from the UniversityManger class
	 */
	static UniversityManager universityManager = new UniversityManager();

	/**
	 * the main method running the constructed method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UniversityManagerTest.run();
	}

	/**
	 * method to store the new people. First clears the list and the tree then
	 * assign people and print the list of them
	 */
	public static void storePeople() {
		universityManager.clear();
		universityManager.addPeople(new Lecturer("Wood", 45, "Computing Science"));
		universityManager.addPeople(new Lecturer("Jones", 45, "Mathematics"));
		universityManager.addPeople(new Student("Smith", 19, 2, "Software Engineering"));
		universityManager.addPeople(new Student("Brown", 21, 2, "Maths"));
		universityManager.addPeople(new Administrator("McCormick", 60, "Principal and Vice-Chancellor"));
		universityManager.addPeople(new Administrator("Adams", 55, "School Manager"));
		universityManager.printPeopleList();
	}

	/**
	 * method to print out the people's names
	 * 
	 * @param list
	 */
	public static void printArrayList(ArrayList<Person> list) {
		for (Person people : list)
			System.out.println(people.getName());
	}

	/**
	 * method to run the program
	 */
	public static void run() {

		/**
		 * store people and then print the list with the stored info
		 */
		storePeople();
		System.out.println("\n--People List--");
		universityManager.printPeopleList();
		System.out.println();

		/**
		 * Print the names in level storage
		 */
		System.out.println("\n--People Tree--");
		universityManager.printPeopleTree();
		System.out.println();

		/**
		 * printing the people in pre/in/post order
		 */
		System.out.println("\n--Pre Order --\n" + universityManager.preWalk());
		System.out.println("\n--In Order --\n" + universityManager.inWalk());
		System.out.println("\n--Post Order --\n" + universityManager.postWalk());

		/**
		 * code to store a name and try to find it in the list of people
		 */
		System.out.println("\n--Find--");
		String personToFind1 = "Brown";
		Person person = universityManager.find(personToFind1);
		if (person != null) {
			System.out.println("Found: " + person);
		} else {
			System.out.println("Could not find " + personToFind1);
		}

		/**
		 * code to store a name and try to find it in the list of people
		 */
		System.out.println("\n--Find--");
		String personToFind2 = "Black";
		Person person2 = universityManager.find(personToFind2);
		if (person2 != null) {
			System.out.println("Found: " + person2);
		} else {
			System.out.println("Could not find " + personToFind2);
		}

		/**
		 * Quick sorting and printing the sorted list first making a list
		 * variable second -> printing the normal list third -> printing the
		 * names after the list being sorted
		 */
		ArrayList<Person> sortedPeople;
		System.out.println("\n--Quicksort--");
		universityManager.printPeopleList();
		sortedPeople = universityManager.Quick();
		printArrayList(sortedPeople);

	}
}
