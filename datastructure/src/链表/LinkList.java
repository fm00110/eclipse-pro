package 链表;

public class LinkList {

	private Node first;
	public LinkList(){
		first = null;
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
		 }
		 else{
		  node.next = first.next;
		  first.next = node;
		}
		 
	}
	/*
	 * ɾ��һ���ڵ㣬��ͷ�ڵ��ɾ��
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
	public static void main(String[] args) {
		LinkList ll = new LinkList();
		ll.insertFirst(23);
		ll.insertFirst(24);
		ll.insertFirst(24);
		ll.insertFirst(24);
		ll.insertFirst(25);
		ll.insertFirst(26);
		ll.insertFirst(27);
		ll.display();
		System.out.println();
		ll.delete();
		ll.display();
		System.out.println();
		//Node node = ll.find(26);
		//node.display();
		ll.delete(24);
		ll.display();
		System.out.println();
	}
}
