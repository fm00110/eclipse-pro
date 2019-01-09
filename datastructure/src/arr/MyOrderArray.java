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
	
	/*�������ݵĴ�С�������*/
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
	/*
	 * ���ַ��������ݣ����Ǹ��������������ģ����������ǰ���С�����˳�������
	 * ���Կ��ٵĲ�����Ҫ������
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
