package javaSort;
/*
 * ѭ�����У�������Ϊ��ʱ������βend����Ϊ-1
 * ������ɾ����ʱ������ͷfront����Ϊ0
 */
public class MyCycleQueue {

	private int[] arr;
	//��Ч���ֵĴ�С
	private int elements;
	//��ͷ
	private int front;
	//��β
	private int end;
	
	public MyCycleQueue(){
		arr = new int[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	/*
	 * �вι���
	 */
	public MyCycleQueue(int maxsize){
		arr = new int[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}
	/*
	 * �������,�Ӷ�β����
	 */
	
	public void insertdata(int value){
		if(end == arr.length-1){
			end = -1;
		}
		arr[++end] = value;
		elements++;
	}
	/*
	 * ɾ�����ݣ��Ӷ�ͷɾ��
	 */
	public int deletedata(){
		int value = arr[front++];
		if(front == arr.length){
			front = 0;
		}
		elements--;
		return value;
		
	}
	
	/*
	 * ��ѯ���ݣ��Ӷ�ͷ�����쿴
	 */
	public int peek(){
		return arr[front];
	}
	
	/*
	 * �ж϶����Ƿ�Ϊ��
	 */
	
	public boolean isEmpty(){
		return elements == 0;
	}
	
	public boolean isFull(){
		return elements == arr.length;
	}
	public static void main(String[] args) {
		MyCycleQueue mq = new MyCycleQueue();
		mq.insertdata(5);
		mq.insertdata(6);
		mq.insertdata(7);
		mq.insertdata(8);
		mq.insertdata(9);
		mq.insertdata(10);
		mq.insertdata(11);
		mq.insertdata(12);
		mq.insertdata(13);
		mq.insertdata(14);

		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		System.out.println(mq.peek());
		System.out.println(mq.peek());
		while(!mq.isEmpty()){
			System.out.print(mq.deletedata()+" ");
		}
		System.out.println();
		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		
		mq.insertdata(5);
		mq.insertdata(6);
		mq.insertdata(7);
		mq.insertdata(8);
		mq.insertdata(9);
		mq.insertdata(10);
		mq.insertdata(11);
		mq.insertdata(12);
		mq.insertdata(13);
		mq.insertdata(14);
		while(!mq.isEmpty()){
			System.out.print(mq.deletedata()+" ");
		}
	}
}
