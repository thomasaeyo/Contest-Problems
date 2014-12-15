public class insertion {
	public static void main(String[] args) {
		int[] array = {5,6,7,1};
		print(array);

		insertion(array);
		print(array);
	}

	/***************
	 *	INSERTION  *
	 ***************/
	public static void insertion(int[] array) {
		int n = array.length;

		for(int j = 1; j < n; j++) {
			int value = array[j];
			int i = j-1;

			while(i >= 0 && array[i] > value) {
				array[i+1] = array[i];
				i--;
			}

			array[i+1] = value;
		}
	}



	public static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}