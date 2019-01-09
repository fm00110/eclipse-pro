package javaSort;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 5, 17, 9, 15, 14, 6, 11 };
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int partion(int[] arr, int left, int right) {
		int leftPtr = left - 1;
		int rightPtr = right;
		int point = arr[right];
		while (true) {
			while (leftPtr < rightPtr && arr[++leftPtr] < point) {
			}
			while (rightPtr > leftPtr && arr[--rightPtr] > point) {
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
		return leftPtr;// 返回最后一个比最右边大的数字的下标
	}

	/*
	 * ��������
	 */
	public static void sort(int[] arr, int left, int right) {
		if(left > right) {
			return ;
		}
		int parttion = partion(arr, left, right);
		sort(arr, left, parttion - 1);
		sort(arr, parttion + 1, right);
	}

	public static int getPart(int[] arr, int left, int right) {
		int leftPtr = left - 1;
		int rightPtr = right;
		int point = arr[right];
		while (true) {
			while (leftPtr < rightPtr && (arr[++leftPtr] < point)) {
			}
			while (rightPtr > leftPtr && (arr[--rightPtr] > point)) {
			}
			if (leftPtr > rightPtr) {
				break;
			} else {
				int temp = 0;
				temp = arr[rightPtr];
				arr[rightPtr] = arr[leftPtr];
				arr[leftPtr] = temp;
			}
		}
		int temp = 0;
		arr[leftPtr] = arr[right];
		arr[right] = temp;
		return leftPtr;
	}

}
