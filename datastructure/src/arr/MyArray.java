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
	
	/*�������*/
	public void insert(int value){
		arr[index] = value;
		index++;
	}
	/*ɾ������*/
	public void delete(int i){
		if(i<0 || i>=index){
			System.out.println("�ַ�Խ��");
		}
		else
		{
			for(int j = i;j<index;j++){
				arr[j] = arr[j+1];
			}
			index--;
		}
	}
	/*����ֵ��������*/
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
	/*����������ѯ����*/
	public int serarchIndex(int i){
		if(i<0 || i>=index){
			System.out.println("�±�Խ��");
			return -1;
		}else{
			return arr[i];
		}

	}
	/*�޸�����*/
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
