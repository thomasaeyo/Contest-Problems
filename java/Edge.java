public class Edge {

	Vertex from;
	Vertex to;
	int dist;

	public Edge(Vertex v1, Vertex v2, int d) {
		from = v1;
		to = v2;
		dist = d;
	}
}