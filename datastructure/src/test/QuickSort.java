package test;

public class QuickSort {

	public static int parttion(int[] arr, int left, int right) {
		int leftPtr = left - 1;
		int rightPtr = right;
		int point = arr[right];
		while (true) {
			while (leftPtr < rightPtr && (arr[++leftPtr] < point)) {
			}
			while (rightPtr > leftPtr && (arr[--rightPtr] > point)) {
			}
			if (leftPtr >= rightPtr) {
				break;
			} else {
				int temp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = temp;
			}

		}
		int temp = arr[right];
		arr[right] = arr[leftPtr];
		arr[leftPtr] = temp;
		return leftPtr;
	}

	public static void sort(int[] arr, int left, int right) {
		if (left > right) {
			return;
		} else {
			int part = parttion(arr, left, right);
			sort(arr, left, part - 1);
			sort(arr, part + 1, right);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 9, 18, 7, 16, 5, 14, 10, 4, 11 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
