import java.util.Scanner;

// Broken
public class median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i = 0; i < n1; i ++) {
			a1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i = 0; i < n2; i ++) {
			a2[i] = sc.nextInt();
		}

		int m = get_median(a1, a2);
		System.out.println(m);
	}
	// array is already sorted
	public static int get_median(int[] a1, int[] a2) {
		int mid;
		int v1;
		int v2;
		int l = 0;
		int u = a1.length - 1;
		int median = 0;

		while(l <= u) {
			mid = (l + u) / 2;
			v2 = ((a1.length + a2.length) / 2) + mid;
			if(a1[mid] >= a2[v2] && a1[mid] <= a2[v2 + 1]) {
				median = a1[mid];
				break;
			} else if(a1[mid] > a2[v2+1]) {
				l = mid + 1;
			} else {
				u = mid - 1;
			}
		}

		l = 0;
		u = a2.length - 1;
		while(l <= u) {
			mid = (l + u) / 2;
			v1 = ((a1.length + a2.length) / 2) + mid;
			if(v1 >= a2.length) {
				break;
			}
			if(a2[mid] >= a1[v1] && a2[mid] <= a1[v1 + 1]) {
				median = a2[mid];
				break;
			} else if(a2[mid] > a1[v1+1]) {
				l = mid + 1;
			} else {
				u = mid - 1;
			}
		}

		return median;

	}
}
