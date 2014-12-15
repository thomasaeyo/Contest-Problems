import java.util.PriorityQueue;


public class bst2 {
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(7);
		bst.insert(4);
		bst.insert(9);
		bst.insert(3);
		bst.insert(5);
        bst.insert(100);
        bst.delete(7);
		bst.print();
        System.out.println("-----------------------------------------");
        System.out.println(bst.contains(3));
        System.out.println(bst.find_max());
        System.out.println(bst.find_min());

        PriorityQueue pq = new PriorityQueue();
        
	}

	public static class BST {
		Node root;

		public BST() {
			root = null;
		}

		public BST(int v) {
			root = new Node(v);
		}

        /************
            PRINT
        ************/
		public void print() {
			if(root == null) System.out.print("null");
			else print(root, 0);
		}

		private void print(Node node, int level) {
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

		/*************
			INSERT
		*************/
		public void insert(int v) {
			root = insert(root, v);
		}

		private Node insert(Node node, int v) {
			if(node == null) return new Node(v);
			if(node.getValue() > v) {
				if(node.getLeft() == null) {
					node.setLeft(new Node(v));
				} else {
					node.setLeft(insert(node.getLeft(), v));
				}
			} else {
				if(node.getRight() == null) {
					node.setRight(new Node(v));
				} else {
					node.setRight(insert(node.getRight(), v));
				}
			}
			return node;
		}

        /*************
            DELETE
        *************/
        public void delete(int v) {
            root = delete(root, v);
        }

        private Node delete(Node node, int v) {
            if(node == null) return node;
            if(node.getValue() > v) {
                node.setLeft(delete(node.getLeft(), v));
            } else if(node.getValue() < v) {
                node.setRight(delete(node.getRight(), v));
            } else {
                if(node.isLeaf()) return null;
                if(node.getRight() == null && node.getLeft() != null) return node.getLeft();
                else if(node.getRight() != null && node.getLeft() == null) return node.getRight();
                else {
                    // swap with max of left subtree
                    int max = find_max(node.getLeft());
                    node.setValue(max);
                    node.setLeft(delete(node.getLeft(), max));
                }
            }
            return node;
        }


        /**************
            CONTAINS
        **************/
        public boolean contains(int v) {
            return contains(root, v);
        }

        private boolean contains(Node node, int v) {
            if(node == null) return false;
            if(node.getValue() > v) return contains(node.getLeft(), v);
            else if(node.getValue() < v) return contains(node.getRight(), v);
            return true;
        }

        /***************
            FIND_MAX
        ***************/
        public int find_max() {
            return find_max(root);
        }

        private int find_max(Node node) {
            if(node.getRight() == null) return node.getValue();
            return find_max(node.getRight());
        }

        /***************
            FIND_MIN
        ***************/
        public int find_min() {
            return find_min(root);
        }

        private int find_min(Node node) {
            if(node.getLeft() == null) return node.getValue();
            return find_min(node.getLeft());
        }

	}


	private static class Node {
		int val;
		Node left;
		Node right;

		public Node(int v) {
			val = v;
			left = null;
			right = null;
		}

		public void setLeft(Node n) {
			left = n;
		}

		public void setRight(Node n) {
			right = n;
		}

        public void setValue(int v) {
            val = v;
        }

		public int getValue() {
			return val;
		}

		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}

		public boolean isLeaf() {
			return (left == null && right == null);
		}
	}
}