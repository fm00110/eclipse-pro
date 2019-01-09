package 双向链表;





public class DoubleLinkList {

	public Node first;
	private Node last;
	
	
	public DoubleLinkList(){
		first = null;
		last = null;
	}
	
	/*
	 * ����һ���ڵ㣬��ͷ�ڵ�ǰ���룬
	 */
	public void insertFirst(int value){
		Node node = new Node(value);
		/*node.next = first;
		first = node;*/
		
		 if(first == null){
			 	//first = node;
		  		last = node;
		 }
		 else{
		  first.previous = node;
		}
		 node.next = first;
		 first = node;
	}
	/*
	 * ����һ���ڵ㣬��β�ڵ����,�����������β�ڵ�ǰ
	 */
	public void insertLast(int value){
		Node node = new Node(value);
		if(isEmpty()){
			first = node;
			
		}else{
			last.next = node;
			node.previous = last;
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
		}else{
			first.previous = null;
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
	 * ��β������ɾ��,��ɾ��β�ڵ�
	 */
	public void deleteLast(){
		if(first.next ==null){  //ֻ��һ��ͷ�ڵ�ʱ����ͷ�ڵ�ָ��ռ���
			first = null;
		}
		else{
			last.previous.next = null;
			
		}
		if(last == null){
			return;
		}
		last = last.previous;
		

	}
	
	/*
	 * ɾ������������ֵ��ɾ����ֻҪֵΪ�����ֵ��ȫ��ɾ��
	 */
	public void delete(int value){
		Node current = first;
		while(current.data != value){
			if(current.next == null){
				return;
			}
			current = current.next;
		}
		if(current == first){
			first = first.next;
		}else{
			current.previous.next = current.next;
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
		DoubleLinkList dl = new DoubleLinkList();
		dl.insertFirst(3);
		dl.insertFirst(4);
		dl.insertFirst(5);
		dl.insertFirst(6);
		dl.insertFirst(7);
		dl.insertFirst(8);
		dl.display();
		System.out.println();
		
		dl.deleteLast();
		dl.display();
		System.out.println();
		
		dl.delete(6);
		dl.display();
		System.out.println();
		
		dl.deleteLast();
		dl.display();
	}
}
