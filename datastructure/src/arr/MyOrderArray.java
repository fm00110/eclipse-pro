package arr;

public class MyOrderArray {

	private int[] arr;
	private int index ;
	public MyOrderArray(){
		arr  = new int[50];
	}
	public MyOrderArray(int max){
		arr  = new int[max];
	}
	
	/*根据数据的大小添加数据*/
	public void insert(int value){
		int i;
		for(i = 0;i<index;i++){
			if(arr[i] >value){
				break;
			}
		}
		for(int j = index;j > i;j--){
			arr[j] = arr[j-1];
		}
		arr[i] = value;
		index++;
		
	}
	/*删除数据*/
	public void delete(int i){
		if(i<0 || i>=index){
			System.out.println("字符越界");
		}
		else
		{
			for(int j = i;j<index;j++){
				arr[j] = arr[j+1];
			}
			index--;
		}
	}
	/*根据值查找数据*/
	public int serarch(int value){
		int i;
		for(i = 0;i<index;i++){
			if(value == arr[i]){
				break;
			}
		}
		if(i == index){
			return -1;
		}else{
			return i;
		}
	}
	/*根据索引查询数据*/
	public int serarchIndex(int i){
		if(i<0 || i>=index){
			System.out.println("下标越界");
			return -1;
		}else{
			return arr[i];
		}

	}
	/*
	 * 二分法查找数据，但是该数组必须是有序的，即该数组是按从小到大的顺序排序的
	 * 可以快速的查找想要的数据
	 */
	public int binbarySearch(int value){
		int low = 0;
		int middle = 0;
		int pow = index;
		while(true){
			middle = (pow+low)/2;
			if(arr[middle] == value){
				return middle;
			} else if(low > pow){
				return -1;
			}else{
				if(arr[middle] > value){
					pow = middle-1;
				} else{
					low = middle+1;
				}
			}
		}

	}
	/*修改数据*/
	public void update(int i, int value){
		if(i<0 || i>=index){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			arr[i] = value;
		}
	}
	
	public void print(){
		for(int i = 0;i<index;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
}
