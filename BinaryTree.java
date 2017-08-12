
package assignment2016UniPeopleManagementQUESTION;

/**
 * BinaryTree - An example of a Binary Tree built using Node objects.
 */
public class BinaryTree {

	/**
	 * Node root variable to store the root of the tree size to store the number
	 * of nodes in the tree
	 */
	private Node root;
	private int size = 0;

	/**
	 * Returns the number of nodes in the tree.
	 * 
	 * @return Number of nodes in the tree.
	 */
	public int size() {
		return size;
	}

	/**
	 * Empties the tree
	 */
	public void clear() {
		this.root = null;
		size = 0;
	}

	/**
	 * Determines if the tree is empty or not.
	 * 
	 * @return true if the tree is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (root != null) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Adds a Node containing a reference to the people v to the tree. if the
	 * tree is empty make that node the root, else reference to the recursive
	 * addingNode method
	 * 
	 * @param person
	 *            The content of the node that will be added
	 */
	public void addNode(Node person) {
		if (root == null) {
			root = person;
			size = 1;
		} else {
			addNode(person, root);
			size = size + 1;
		}
	}

	/**
	 * Internal recursive method to add a node If the first result is negative
	 * going to the left child and if there is something checks again in the end
	 * assign a node in the left if the last compare result was negative If the
	 * first result is positive - analog with the right child,in the end assign
	 * a node in the right if the last compare result was positive
	 * 
	 * @param nodeToInsert
	 *            The content to place in the tree
	 * @param currentNode
	 *            The current node to consider, will not be null
	 */
	private void addNode(Node nodeToInsert, Node currentNode) {
		if (nodeToInsert.compareTo(currentNode) < 0) {
			if (currentNode.hasLeft())
				addNode(nodeToInsert, currentNode.getLeft());
			else {
				currentNode.setLeft(nodeToInsert);
				return;
			}
		} else {
			if (currentNode.hasRight())
				addNode(nodeToInsert, currentNode.getRight());
			else {
				currentNode.setRight(nodeToInsert);
				return;
			}
		}
	}

	/**
	 * Public call to start the recursive pre-order traversal using the root of
	 * the tree. Pre-order traversal is also known as pre-fix traversal.
	 * 
	 * @return A reference to a comma separated String containing the trees
	 *         contents as determined by a preOrder Traversal.
	 */
	public String preOrderTraversal() {
		StringBuffer stringBuffer = new StringBuffer();
		if (root == null)
			return "Empty Tree!";
		else
			preOrder(root, stringBuffer);
		return stringBuffer.toString();
	}

	/**
	 * Private method used to make a recursive call from a particular node
	 * 
	 * @param node
	 *            The node to perform a pre-order traversal from.
	 */
	private void preOrder(Node node, StringBuffer stringBuffer) {
		// visit the Nodes and add contents to our String
		stringBuffer.append(node.getPersonName().toString() + ", ");
		// 1 Visit Node
		if (node.hasLeft())
			preOrder(node.getLeft(), stringBuffer);
		// 2 Visit left
		if (node.hasRight())
			preOrder(node.getRight(), stringBuffer);
		// 3 Visit right

	}

	/**
	 * Public call to start a recursive in-order traversal using the root of the
	 * tree. In-order traversal is often called in-fix traversal.
	 * 
	 * @return A reference to a comma separated String containing the trees
	 *         contents as determined by an in-order traversal.
	 */
	public String inOrderTraversal() {
		StringBuffer stringBuffer = new StringBuffer();
		if (root == null)
			return "Empty Tree!";
		else
			inOrder(root, stringBuffer);
		return stringBuffer.toString();
	}

	/**
	 * Private method used to make a recursive in-order traversal from node 'n'
	 * 
	 * @param node
	 *            The node to perform the inOrder walk from
	 */
	private void inOrder(Node node, StringBuffer stringBuffer) {

		if (node.hasLeft())
			inOrder(node.getLeft(), stringBuffer);
		stringBuffer.append(node.getPersonName().toString() + ", ");
		if (node.hasRight())
			inOrder(node.getRight(), stringBuffer);

	}

	/**
	 * Public call to start the recursive post-order traversal using the root of
	 * the tree. Post order traversal is also called postfix and is used to
	 * create a Reverse Polish notation of a tree suitable for calculating
	 * equations.
	 * 
	 * @return A reference to a comma separated String containing the trees
	 *         contents as determined by a post-order traversal.
	 */
	public String postOrderTraversal() {
		StringBuffer stringBuffer = new StringBuffer();
		if (root == null)
			return "Empty Tree!";
		else
			postOrder(root, stringBuffer);
		return stringBuffer.toString();
	}

	/**
	 * Private method used to make a recursive postOrder traversal for node 'n'
	 * 
	 * @param node
	 *            The node to perform the postOrder walk from
	 */
	private void postOrder(Node node, StringBuffer stringBuffer) {
		if (node.hasLeft())
			postOrder(node.getLeft(), stringBuffer);
		if (node.hasRight())
			postOrder(node.getRight(), stringBuffer);
		stringBuffer.append(node.getPersonName().toString() + ", ");

	}

	/**
	 * reference method for finding the name in the list of people
	 * 
	 * @param name
	 * @return
	 */

	public Person find(String name) {
		return find(name, root);
	}

	/**
	 * method to find the name in the list/tree of nodes by comparing variables
	 * 
	 * @param name
	 * @param node
	 * @return
	 */
	private Person find(String name, Node node) {
		if (node == null)
			return null;
		int order = name.compareTo(node.getPersonName().toString());
		if (order == 0)
			return node.getPerson();
		if (node.hasLeft() && order < 0)
			return find(name, node.getLeft());
		if (node.hasRight() && order > 0)
			return find(name, node.getRight());
		return null;

	}

	/**
	 * method to print out the binary tree
	 */
	public void printTree() {
		System.out.println("\n");
		printIndentedTree(root, 0);

	}

	/**
	 * Internal method used to make a recursive reverse order walk from node
	 * 'n'. This method is useful to see the current structure of the tree
	 * (turned on its side)
	 * 
	 * @param node
	 *            The node to start the reverse order walk from
	 * @param depth
	 *            The current depth of the node in the tree
	 * @param print
	 *            true if we should print out node, false otherwise
	 */
	private void printIndentedTree(Node node, int depth) {
		if (node.hasRight())
			printIndentedTree(node.getRight(), depth + 1);
		// Show depth of current code by indenting to the right
		for (int d = 0; d < depth; d++)
			System.out.print("  ");
		System.out.println(node.getPersonName().toString());
		if (node.hasLeft())
			printIndentedTree(node.getLeft(), depth + 1);
	}
}
