package 排序;

public class Quick {

	public static int partion(int[] arr, int left, int right, int point){
		int leftPtr = left - 1;
		int rightPtr = right;
		while(true){
			//����
			while(leftPtr < rightPtr && arr[++leftPtr] < point){
				
			}
			while(rightPtr > leftPtr && arr[--rightPtr] > point){
				
			}
			if(leftPtr >= rightPtr){
				break;
			} else{
				int temp = arr[leftPtr];
				arr[leftPtr] = arr[rightPtr];
				arr[rightPtr] = temp;
			}
		}
		int temp = arr[leftPtr];
		arr[leftPtr] = arr[right];
		arr[right] = temp;
		//���������
		return leftPtr;
		
	}
	
	public static void sort(int[] arr, int left, int right){
		if(left >= right){
			return;
		} else{
		int point = arr[right];
		int parttion = partion(arr, left, right, point);
		sort(arr,left,parttion-1);
		sort(arr,parttion+1,right);
		}
	}
	public static void main(String[] args) {
		//int[] arr = {13,17,5,19,7,4,33,14,9,8,11};
		int[] arr = {9,8,18,5,16,33,23,7,12,10};
		sort(arr, 0, arr.length-1);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
}
