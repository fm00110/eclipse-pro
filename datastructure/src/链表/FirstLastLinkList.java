package 链表;


/*
 * ˫��������ͷ�ڵ��ָ��������һ���ڵ㣬Ҳָ��β�ڵ㣬˫�����������β�ڵ�����
 */
public class FirstLastLinkList {

	private Node first;
	
	private Node last;
	
	public FirstLastLinkList(){
		first = null;
		last = null;
	}
	
	/*
	 * ����һ���ڵ㣬��ͷ�ڵ�����
	 */
	public void insertFirst(int value){
		Node node = new Node(value);
		/*node.next = first;
		first = node;*/
		
		 if(first == null){
			 	first = node;
		  		last = node;
		 }
		 else{
		  node.next = first.next;
		  first.next = node;
		}
		 
	}
	/*
	 * ����һ���ڵ㣬��β�ڵ����
	 */
	public void insertLast(int value){
		Node node = new Node(value);
		if(isEmpty()){
			first = node;
			last = node;
		}else{
			last.next = node;
		}
		last = node;
	}
	/*
	 * ɾ��ͷ�ڵ�
	 */
	public Node deleteFirst(){
		Node temp = first;
		if(first.next == null){
			last = null;
		}
		first = temp.next;
		return temp;
	}
	/*
	 * ɾ��һ���ڵ㣬��ͷ�ڵ��ɾ������ɾ��ͷ�ڵ����һ���ڵ�
	 */
	public Node delete(){
		Node temp = first.next;
		first.next = temp.next;
		return temp;
	}
	/*
	 * ɾ������������ֵ��ɾ����ֻҪֵΪ�����ֵ��ȫ��ɾ��
	 */
	public void delete(int value){
		Node current = first;
		Node previous = first;
		while(current.data != value){
			if(current.next == null){
				return;
			}
			previous = current;
			current = current.next;
		}
		if(current == first){
			first = first.next;
		}else{
			previous.next = current.next;
		}
		this.delete(value);//ɾ��ֵΪvallue�����нڵ㣬���ֻ��ɾ��һ���ڵ㣬����Ҫ��һ��

	}
	/*
	 * ��ʾ����
	 */
	public void display(){
		Node current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
	/*
	 * ���ҷ���
	 */
	public Node find(int value){
		Node current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	public static void main(String[] args) {
		FirstLastLinkList ll = new FirstLastLinkList();
		ll.insertFirst(5);
		ll.insertFirst(6);
		ll.insertFirst(7);
		ll.insertFirst(8);
		ll.insertFirst(9);
		
		ll.display();
		System.out.println();
		
		ll.deleteFirst();
		ll.display();
		System.out.println();
		
		/*����Ĳ���ֻ��������Ϊ�յ�ʱ�����Ч
		 * ll.insertLast(10);
		ll.insertLast(11);
		ll.insertLast(12);
		ll.insertLast(13);
		ll.display();
		System.out.println();*/
	}
}
