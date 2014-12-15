import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Dijkstra {
	public static void main(String[] args) {
		Vertex v_A = new Vertex("A");
		Vertex v_B = new Vertex("B");
		Vertex v_C = new Vertex("C");
		Vertex v_D = new Vertex("D");
		Vertex v_E = new Vertex("E");
		Vertex v_F = new Vertex("F");
		Vertex v_G = new Vertex("G");
		Vertex v_H = new Vertex("H");
		Vertex v_I = new Vertex("I");
		Vertex v_J = new Vertex("J");

		v_A.createEdge(v_B, 3);
		v_A.createEdge(v_E, 5);
		v_A.createEdge(v_C, 7);
		v_B.createEdge(v_D, 6);
		v_C.createEdge(v_E, 1);
		v_C.createEdge(v_F, 2);
		v_D.createEdge(v_E, 1);
		v_D.createEdge(v_G, 1);
		v_E.createEdge(v_G, 6);
		v_E.createEdge(v_I, 5);
		v_E.createEdge(v_H, 4);
		v_F.createEdge(v_H, 3);
		v_F.createEdge(v_J, 4);
		v_G.createEdge(v_I, 2);
		v_H.createEdge(v_I, 2);
		v_H.createEdge(v_J, 1);
		v_I.createEdge(v_J, 3);

		ArrayList<Vertex> list = new ArrayList<Vertex>();
		list.add(v_A);
		list.add(v_B);
		list.add(v_C);
		list.add(v_D);
		list.add(v_E);
		list.add(v_F);
		list.add(v_G);
		list.add(v_H);
		list.add(v_I);
		list.add(v_J);

		System.out.println(dijkstra(v_A, v_J, list));
	}


	// TODO: get path
	public static int dijkstra(Vertex v1, Vertex v2, ArrayList<Vertex> list) {
		HashMap<Vertex, Integer> dists = new HashMap<Vertex, Integer>();
		dists.put(v1, 0);
		for(Vertex v : list) {
			if(v != v1) dists.put(v, Integer.MAX_VALUE);
		}

		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(v1);
		while(queue.peek() != null) {
			Vertex v = queue.poll();
			HashMap<Vertex, Integer> neighbors = v.getEdges();
			for(Vertex vv : neighbors.keySet()) {
				int dist = neighbors.get(vv);
				if(dist + dists.get(v) < dists.get(vv)) {
					dists.put(vv, dist + dists.get(v));
					queue.add(vv);
				}
			}
		}
		return dists.get(v2);
	}
}