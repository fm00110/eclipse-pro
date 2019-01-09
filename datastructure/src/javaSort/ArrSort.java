package javaSort;

public class ArrSort {

	public void sort(int[] arr){
		int temp;
		int k=0;
		for(int i = 0;i<arr.length-1;i++ ){
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
	/*
	 * ѡ������
	 */
	public void assort(int[] arr){
		int k=0;
		int temp;
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
	/*
	 * ��������
	 */
	public void insertSort(int[] arr){
		int temp;
		for(int i = 1;i<arr.length;i++){
			temp = arr[i];//������ 
			int j = i;
			while((j > 0) && (arr[j] >= temp)){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	/*
	 * ��������
	 */
	public void insSort(int[] arr){
		int temp;
		for(int i = 0;i<arr.length;i++){
			for(int j = i;(j>0) && (arr[j] <arr[j-1]);j--){
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		//int arr[] = {3,8,6,4,9,5};
		int arr[] = {4,8,36,6,17,9,5};
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();  
		ArrSort as = new ArrSort();
		//as.assort(arr);
		as.insertSort(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
