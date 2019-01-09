package 双向链表;



public class Node {

	public int data;
	
	public Node next;
	
	public Node previous;
	
	public Node(int value){
		this.data = value;
	}
	
	public void display(){
		System.out.print(data+" ");
	}
	
	
}
