import java.util.HashMap;


public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private HashMap<Vertex, Integer> edges;

	public Vertex(String s) {
		name = s;
		edges = new HashMap<Vertex, Integer>();
	}

	public String getName() {
		return name;
	}

	public void createEdge(Vertex v, int dist) {
		edges.put(v, dist);
	}

	public HashMap<Vertex, Integer> getEdges() {
		return edges;
	}

	public int compareTo(Vertex v) {
		return name.compareTo(v.getName());
	}
}