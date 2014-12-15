public class BST < T extends Comparable<T> > {

	private Node<T> root;


	public BST() {
		root = null;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void insert(T value) {
		root = insert(root, value);
	}

	// left <= this < right
	private Node<T> insert(Node<T> node, T value) {
		if(node == null) return new Node<T>(value);
		else {
			if((node.getValue()).compareTo(value) >= 0) {
				node.setLeft(insert(node.getLeft(), value));
			} else {
				node.setRight(insert(node.getRight(), value));
			}
		}
		return node;
	}

	public boolean contains(T value) {
		return contains(root, value);
	}

	private boolean contains(Node<T> node, T value) {
		if(node == null) return false;
		else if((node.getValue()).compareTo(value) == 0) return true;
		else if((node.getValue()).compareTo(value) > 0) return contains(node.getLeft(), value);
		else return contains(node.getRight(), value);
	}

	public void delete(T v) {
		root = delete(root, v);
	}

	private Node<T> delete(Node<T> node, T v) {
		if(node == null) return null;
		
		if(node.getValue().compareTo(v) < 0) {
			node.setRight(delete(node.getRight(), v));
		} else if(node.getValue().compareTo(v) > 0) {
			node.setLeft(delete(node.getLeft(), v));
		} else {
    		// no child
    		if (node.getLeft() == null && node.getRight() == null) {
    			// System.out.println(node.getLeft() + " <- " + node.getValue() + " -> " + node.getRight());
    			node = null;
    		// one child
    		} else if(node.getLeft() == null && node.getRight() != null) {
    			node = node.getRight();
    		} else if(node.getLeft() != null && node.getRight() == null) {
    			node = node.getLeft();
    		// two children
    		} else {
    			// not done yet
    		}
	    }
	    return node;
	}

	public void print() {
		if(root == null) System.out.print("null");
		else print(root, 0);
	}

	private void print(Node<T> node, int level) {
		if(node.getRight() != null) {
			print(node.getRight(), level+1);
		}
		if(node != null) {
			String s = "";
			for(int i = 0; i < level; i++) s += "  ";
			System.out.println(s + node.getValue());
		}
		if(node.getLeft() != null) {
			print(node.getLeft(), level+1);
		}
	}

	// Node
	private class Node< T extends Comparable<T> > {
		private T value;
		private Node<T> leftChild;
		private Node<T> rightChild;

		public Node(T value) {
			this.value = value;
			leftChild = null;
			rightChild = null;
		}

		public Node(T value, Node<T> left, Node<T> right) {
			this.value = value;
			leftChild = left;
			rightChild = right;
		}

		public void setLeft(Node<T> left) {
			leftChild = left;
		}

		public void setRight(Node<T> right) {
			rightChild = right;
		}

        public void setValue(T value) {
            this.value = value;
        }

		public T getValue() {
			return value;
		}

		public boolean isLeaf() {
			return leftChild == null && rightChild == null;
		}

		public Node<T> getLeft() {
			return leftChild;
		}

		public Node<T> getRight() {
			return rightChild;
		}

		public String toString() {
			return "" + value;
		}
	}


}