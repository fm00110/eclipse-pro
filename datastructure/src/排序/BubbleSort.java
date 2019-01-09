package 排序;


/*
 * ð������
 */
public class BubbleSort {

	public void sort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j = arr.length-1;j>i;j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		BubbleSort bs= new BubbleSort();
		int[] arr = {3,5,8,7,9,15,4};
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		bs.sort(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
