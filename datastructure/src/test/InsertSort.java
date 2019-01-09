package test;

public class InsertSort {

	public static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; (j > 0) && (arr[j] < arr[j - 1]); j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 6, 4, 9, 5 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
