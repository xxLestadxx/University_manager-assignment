/* 
 * Student number : 2422647
 * CSCU9A3
 * version: November2016
 */

package assignment2016UniPeopleManagementQUESTION;

public class Node {

	/**
	 * variables for the nodes in the variable of the class Person -> People
	 * stored at this node in the variable left of the class Node -> the left
	 * node of this node in the variable of the class Person - > the right node
	 * of this node
	 */
	private Person person = null;
	private Node left = null;
	private Node right = null;

	/**
	 * Default constructor that initialises the node with a Page associated with
	 * this node.
	 * 
	 * @param c
	 *            The content of the node
	 */
	public Node(Person p) {
		person = p;
	}

	/**
	 * Set the left reference of this node to n
	 * 
	 * @param n
	 *            A reference to the new left node
	 */
	public void setLeft(Node n) {
		left = n;
	}

	/**
	 * Set the right reference of this node to n
	 * 
	 * @param n
	 *            A reference to the new right node
	 */
	public void setRight(Node n) {
		right = n;
	}

	/**
	 * method to get the person
	 * 
	 * @return the person's info
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * method to get the person's name
	 * 
	 * @return the person's name
	 */
	public String getPersonName() {
		return person.getName();
	}

	/**
	 * method to check if there is a node on the left of the tree
	 * 
	 * @return left if the variable is different from null
	 */
	public boolean hasLeft() {
		return left != null;
	}

	/**
	 * method to check if there is a node on the right of the tree
	 * 
	 * @return right if the variable is different from null
	 */
	public boolean hasRight() {
		return right != null;
	}

	/**
	 * method to get what's in the left child
	 * 
	 * @return returns the information stored in the corresponding left node
	 */
	public Node getLeft() {
		return this.left;
	}

	/**
	 * method to get what's in the right child
	 * 
	 * @return returns the information stored in the corresponding right node
	 */
	public Node getRight() {
		return this.right;
	}

	/**
	 * method to compare the method in two nodes
	 * 
	 * @param p
	 * @return -,goes to the Left; 0 ;or +, goes to the Right
	 */
	public int compareTo(Node p) {
		int x = this.getPersonName().compareTo(p.getPersonName());
		return x;

	}

	/**
	 * method toString()
	 */
	public String toString() {
		return "";
	}
}
