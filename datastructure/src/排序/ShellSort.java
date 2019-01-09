package 排序;

public class ShellSort {

	public static void sort(int[] arr) {
		int h = 1;
		while (h <= arr.length / 3) {
			h = h * 3 + 1;
		}
		int temp = 0;
		for (; h > 0; h = (h - 1) / 3) {
			for (int i = h; i < arr.length; i++) {
				temp = arr[i];
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
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
