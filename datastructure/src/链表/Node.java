package 链表;
/*
 * ���ڵ㣬�൱���ǳ���
 */
public class Node {

	//������
	public int data;
	//ָ����ָ����һ���ڵ�
	public Node next;
	public Node(int value){
		this.data = value;
	}
	
	public void display(){
		System.out.print(data+" ");
	}
	
}
