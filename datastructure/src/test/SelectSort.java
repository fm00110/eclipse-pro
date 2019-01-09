package test;
/*
 * —°‘Ò≈≈–Ú
 */
public class SelectSort {

	public static void sort(int[] arr){
		int k = 0;
		int temp = 0;
		for(int i = 0;i<arr.length-1;i++){
			k = i;
			for(int j = i;j<arr.length;j++){
				if(arr[j] < arr[k]){
					k = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr={3,9,6,5,8,4};
		sort(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
