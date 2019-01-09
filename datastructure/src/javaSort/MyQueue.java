package javaSort;

public class MyQueue {

	private int[] arr;
	//��Ч���ֵĴ�С
	private int elements;
	//��ͷ
	private int front;
	//��β
	private int end;
	
	public MyQueue(){
		arr = new int[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	/*
	 * �вι���
	 */
	public MyQueue(int maxsize){
		arr = new int[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}
	/*
	 * �������,�Ӷ�β����
	 */
	
	public void insertdata(int value){
		arr[++end] = value;
		elements++;
	}
	/*
	 * ɾ�����ݣ��Ӷ�ͷɾ��
	 */
	public int deletedata(){
		elements--;
		return arr[front++];
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
		MyQueue mq = new MyQueue();
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
		mq.deletedata();
		System.out.println(mq.peek());
		while(!mq.isEmpty()){
			
		}
	}
}
