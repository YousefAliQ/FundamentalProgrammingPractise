public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	public BinaryNode getRoot() {
		return root;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 * 
	 * @param lvr
	 */
	public void printTree(bstTravirsal mode) {
		if (root == null) {
			System.out.println("Empty tree");
		} else {
			if (mode == null) {
				mode = bstTravirsal.LVR;
			}
			printTree(root, mode);
		}

	}

	private void printTree(BinaryNode t, bstTravirsal mode) {
		if (t != null) {

			if (mode == bstTravirsal.LVR) {
				printTree(t.left, mode);
				System.out.print(t.element + " ");
				printTree(t.right, mode);
			} else {
				if (mode == bstTravirsal.VLR) {

					System.out.print(t.element + " ");
					printTree(t.left, mode);
					printTree(t.right, mode);

				} else {
					printTree(t.left, mode);
					printTree(t.right, mode);
					System.out.print(t.element + " ");
				}
			}

		} // An INORDER Traversal
	}

//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;

		while (!inserted) {
			if (x.compareTo(n.element) < 0) {
				// space found on the left
				if (n.left == null) {
					n.left = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
			} else if (x.compareTo(n.element) > 0) {
				// space found on the right
				if (n.right == null) {
					n.right = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}

	private class BinaryNode {

		// Constructors
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
	}

	public int countNodes(BinaryNode n) {
		// TODO Auto-generated method stub
		if (n == null) {
			return 0;
		}
		return 1 + countNodes(n.left) + countNodes(n.right);
	}

	public int countLeaves(BinaryNode n) {
		// TODO Auto-generated method stub

		if (n == null) {
			return 0;
		} else {
			if (n.left == null && n.right == null) {
				return 1; 
			}else {
				return countLeaves(n.left) + countLeaves(n.right);
			}
		}
		
	}
	
	public boolean allEven(BinaryNode n) {
		if (n == null) {
			return true;
		}
		
		if (n.element %2 == 0) {
			return allEven(n.left) && allEven(n.right);
		}else {
			return false;
		}
	}
}
