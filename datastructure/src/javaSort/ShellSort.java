package javaSort;
/*
 * ϣ������
 */
public class ShellSort {

	public static void sort(int[] arr) {
		// ��ʼ��һ�����
		int h = 1;

		while (h < arr.length / 3) {
			h = h * 3 + 1;
		}
		// ���������
		for (; h > 0; h = (h - 1) / 3) {
			for (int i = h; i < arr.length; i++) {
				int j = i;
				int temp = arr[i];
				while (j > h - 1 && (arr[j - h]) > temp) {
					arr[j] = arr[j - h];
					j = j - h;
				}
				arr[j] = temp;
			}
		}
	}
	public static void shell(int[] arr){
		int h = 1;
		while (h <= arr.length / 3) {
			h = h * 3 + 1;
		}
		for (; h > 0; h = (h - 1) / 3) {
			for (int i = h; i < arr.length; i++) {
				int temp = arr[i];
				int j = i;
				while (j > 0 && (arr[j] < arr[j - h])) {
					arr[j] = arr[j - h];
					j = j - h;
				}
				arr[j] = temp;
			}
		}
	}
	
	public static void shellsort(int[] arr){
		int h = 1;
		while (h < arr.length / 3) {
			h = h * 3 + 1;
		}
		for (; h > 0; h = (h - 1) / 3) {
			for (int i = h; i < arr.length; i++) {
				int temp = arr[i];
				int j = i;
				while (j > h - 1 && arr[j - h] > temp) {
					arr[j] = arr[j - h]; 
					j = j - h;
				}
				arr[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 3, 9, 6, 4, 8, 5, 18, 15, 2, 17 };
		shellsort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
