package test;

public class CycleQueue {

	private int[] arr;
	private int elements;
	private int front;
	private int end;
	public CycleQueue() {
		arr = new int[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	public CycleQueue(int maxsize){
		arr = new int[maxsize];
		elements = 0;
		front = 0;
		end = -1;
		
	}
	public void insert(int value){
		if(end == arr.length-1){
			end = -1;
		}
		arr[++end] = value;
		elements++;
	}
	
	public int delete(){
		int temp = arr[front++];
		if(front == arr.length){
			front = 0;
		}
		elements--;
		return temp;
	}
	
	public boolean isEmpty(){
		return elements==0;
	}
	public boolean isFull(){
		return elements == arr.length;
	}
	
	public int peek(){
		return arr[front];
	}
	public static void main(String[] args) {
		CycleQueue cq = new CycleQueue();
		cq.insert(3);
		cq.insert(4);
		cq.insert(5);
		cq.insert(6);
		
		cq.insert(7);
		cq.insert(8);
		cq.insert(3);
		cq.insert(10);
		cq.insert(11);
		cq.insert(12);
		System.out.println(cq.isEmpty());
		System.out.println(cq.isFull());
		System.out.println(cq.peek());
		System.out.println(cq.peek());
		while(!cq.isEmpty()){
			System.out.print(cq.delete()+" ");
		}
		System.out.println();
		System.out.println(cq.isEmpty());
		System.out.println(cq.isFull());
		
		cq.insert(3);
		cq.insert(4);
		cq.insert(5);
		cq.insert(6);
		
		cq.insert(7);
		cq.insert(8);
		cq.insert(3);
		cq.insert(10);
		cq.insert(11);
		cq.insert(12);
		while(!cq.isEmpty()){
			System.out.print(cq.delete()+" ");
		}
	}
}
