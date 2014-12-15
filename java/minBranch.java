Set<String> allBranches(Node n) {
	Set<String> branches = new Set<String>();
	if(n.getChildren() == null) {
	branches.add(n.getValue());
}

else {
	ArrayList<Node> children = n.getChildren();
	for(Node c : children) {
		Set<String> subBranches = allBranches(c);
		for(String sub : subBranches) {
	branches.add(sub + c.getValue());
} 
}
}

return branches;
}


public Tree {
	private Node root;
	
	



	private class Node {
		private String letter;
		private ArrayList<Node> children;

		public Node(String s) {
			letter = s;
			children = null;
}

public void addChild(Node n) {
	if(children == null) {
		children = new ArrayList<Node>();
}

children.add(n);
}

public ArrayList<Node> getChildren() {
}

// plus more
}
}