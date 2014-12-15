import java.util.Scanner;


public class MinHeap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		
		MinHeap minheap = new MinHeap();
		while(!next.equals("END")) {
			if(next.equals("ADD")) {
				int v = sc.nextInt();
				minheap.insert(v);
			} else if(next.equals("DELETE")) {
				minheap.deleteMin();
			} 
			System.out.println("---------------------------------");
			minheap.print();
			next = sc.next();
		}
	}




	private int[] heap;
	private int size;

	public MinHeap() {
		heap = new int[2];
		heap[0] = Integer.MIN_VALUE;
		size = 0;
	}

	public void insert(int v) {
		if(size == heap.length - 1) doubleIt();
		heapUp(v, size+1);
		size++;
	}

	public void deleteMin() {
		heap[1] = heap[size];
		heap[size] = 0;
		size--;
		percolateDown(1);
	}

	public void percolateDown(int i) {
		int lchild = 2*i;
		int rchild = 2*i + 1;

		if(lchild > size) {
			return;
		} else if(rchild > size) {
			swap(i, lchild);
		} else if(heap[lchild] < heap[rchild]) {
			swap(i, lchild);
			percolateDown(lchild);
		} else {
			swap(i, rchild);
			percolateDown(rchild);
		}
	}

	public void heapUp(int v, int i) {
		if(heap[i / 2] > v) {
			swap(i, i/2);
			heapUp(v, i/2);
		} else {
			heap[i] = v;
		}
	}

	public void doubleIt() {
		int[] newHeap = new int[2*heap.length];
		for(int i = 0; i < heap.length; i++) {
			newHeap[i] = heap[i];
		}
		heap = newHeap;
	}

	public void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public void print() {
		System.out.print("MINHEAP: ");
		for(int i = 1; i < size+1; i++) {
			System.out.print(heap[i] + " ");
		} 
		System.out.println();
	}
}