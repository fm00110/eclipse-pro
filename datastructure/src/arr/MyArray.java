package arr;

public class MyArray {

	private int[] arr;
	private int index ;
	public MyArray(){
		arr  = new int[50];
	}
	public MyArray(int max){
		arr  = new int[max];
	}
	
	/*添加数据*/
	public void insert(int value){
		arr[index] = value;
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
