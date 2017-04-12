/* 
 * Student number : 2422647
 * CSCU9A3
 * version: November2016
 */

package assignment2016UniPeopleManagementQUESTION;

import java.util.ArrayList;

public class UniversityManager {

	/**
	 * arrayList to store the people and variable reference to the binarytree
	 */
	private ArrayList<Person> people;
	private BinaryTree binarytree;

	/**
	 * a method to initialize the program
	 */
	public UniversityManager() {
		people = new ArrayList<Person>();
		binarytree = new BinaryTree();
	}

	/**
	 * method to clear all of the information and initialize new program
	 */
	public void clear() {
		people.clear();
		binarytree.clear();
	}

	/**
	 * method to add people in the list
	 * 
	 * @param p
	 */
	public void addPeople(Person p) {
		people.add(p);
		Node n = new Node(p);
		binarytree.addNode(n);
	}

	/**
	 * method to print the information about the people
	 */
	public void printPeopleList() {
		for (Person node : people) {
			System.out.println(node.toString());
		}

	}

	/**
	 * method to printout the people in the level tree order
	 */
	public void printPeopleTree() {
		binarytree.printTree();
	}

	/**
	 * method to print the peopleTree in preOrder
	 * 
	 * @return printed list of the names in preOrder
	 */
	public String preWalk() {
		return binarytree.preOrderTraversal();
	}

	/**
	 * method to print the peopleTree in InOrder
	 * 
	 * @return printed list of the names in inOrder
	 */
	public String inWalk() {
		return binarytree.inOrderTraversal();
	}

	/**
	 * method to print the peopleTree in postOrder
	 * 
	 * @return printed list of the names in postOrder
	 */
	public String postWalk() {
		return binarytree.postOrderTraversal();
	}

	/**
	 * to connect with binary find
	 * 
	 * @param name
	 * @return the name of the wanted person if found
	 */
	public Person find(String name) {
		return binarytree.find(name);
	}

	/**
	 * Quick sort method to sort the names
	 * 
	 * @return
	 */
	public ArrayList<Person> Quick() {
		// the sort initiates a start (i) from 1 to .size()
		for (int i = 1; i < people.size(); i++) {
			// creates a pivot variable to ... pivot when needed
			Person pivot = people.get(i);
			// initiates second variable j
			int j = i - 1;
			// when j is not negative and the product of the compare method is
			// positive
			while (j >= 0 && people.get(j).compareTo(pivot) > 0) {
				// it's setting j+1 position the element in get(j)
				people.set(j + 1, people.get(j));
				// decrements j in order to get in the loop again if the
				// condition is true
				j--;
			}
			// at the last enter in the for loop the pivot is going to be set as
			// the last item in the list
			people.set(j + 1, pivot);
		}
		return people;
	}
}
