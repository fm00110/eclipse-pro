package 栈和列队;
/*
 * ������ģ��ջ
 */
public class MyStack {

	private int[] arr;
	private int index;
	
	public MyStack(){
		arr = new int[10];
		index = 0;
	}
	
	public void push(int value){
		arr[index++] = value;

	}
	public void delete(int i){
		
	}
	public int pop(){
		index--;
		return arr[index];
	}
	public boolean isEmpty(){
		return index==0?true:false;
	}
	public boolean isFull(){
		return index==arr.length?true:false;
	}
	
	public int top(){
		return arr[index-1];
	}
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		System.out.println(ms.isEmpty());
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.push(5);
		ms.push(6);
		ms.push(7);
		ms.push(8);
		ms.push(9);
		
		System.out.println(ms.isFull());
		System.out.println(ms.top());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}
