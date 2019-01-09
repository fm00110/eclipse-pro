package 树;
/*
 * ������
 */
public class Tree {
	//���ڵ�
	public Node root;
	
	//����ڵ�
	public void insert(int value,String sData){
		//��װ�ڵ�
		Node newNode = new Node(value,sData);
		// ���õ�ǰ�ڵ�
		Node current = root;
		// ���ø��
		Node parent;
		if (root == null) {
			root = newNode;
			return;
		} else {
			//��ѭ������Ҫ���������һֱ�뵱ǰ�����ݱȽ�
			while (true) {
				//���ڵ�ָ��ǰ�ڵ�
				parent = current;
				//�����ǰָ��Ľڵ����ݱȲ����Ҫ���������ߣ�����������
				if (current.data > value) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node find(int value){
		//���õ�ǰ�ڵ㣬�Ӹ��ڵ㿪ʼ
		Node current = root;
		//ѭ����ֻҪ��ǰ�ڵ��ֵ��������Ҫ���ҵ�������
		 while(current.data != value){
			 //���бȽϣ��Ƚϲ���ֵ�͵�ǰ�ڵ�Ĵ�С
			 if(current.data < value){
				 current = current.rightChild;
				 
			 } else{
				 current = current.leftChild;
				 
			 }
			 //����Ҳ������ͷ��ؿ�
			 if(current == null){
				 return null;
			 }
		 }
		 return current;
	}
	/*
	 * ɾ���ڵ�
	 * 1��Ҫɾ���Ľڵ���Ҷ�ӽڵ㣬��û���ӽڵ�Ľڵ�
	 * 2��ɾ���Ľڵ�ֻ��һ���ӽڵ�
	 * 3��ɾ���Ľڵ��������ӽڵ�
	 */
	public boolean delete(int value){
		//���õ�ǰ�ڵ㣬�Ӹ��ڵ㿪ʼ
		Node current = root;
		//���õ�ǰ�ڵ�ĸ��ڵ�
		Node parent = root;
		//�ж�Ҫɾ���Ľڵ��Ƿ�Ϊ��ڵ�
		boolean isLeftChild = true;
		while(current.data != value){
			parent = current;
			if(current.data < value){
				current = current.rightChild;
				isLeftChild = false;
			} else{
				current = current.leftChild;
				isLeftChild = true;
			}
			if(current == null){
				return false;
			}
		}
		//ɾ��Ҷ�Ӽ��㣬Ҳ���Ǹýڵ�û���ӽڵ�
		if(current.leftChild == null && current.rightChild == null){
			//����ü��������ĸ��ڵ�����ӽڵ�
			if(isLeftChild){
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			} 
		} else if(current.leftChild == null){    //�ýڵ�ֻ��һ���ҽڵ��ǣ�ɾ�����
			if(isLeftChild){
				parent.leftChild = current.rightChild;   //��ǰ�ڵ�ʱ��ڵ�ʱ
			}else{
				parent.rightChild = current.rightChild;   //��ǰ�ڵ�ʱ�ҽڵ�ʱ
			}
			
		} else if(current.rightChild == null){    //�ýڵ�ֻ��һ����ڵ�ʱ��ɾ�����
			if(isLeftChild){
				parent.leftChild = current.leftChild;  //��ǰ�ڵ�ʱ��ڵ�ʱ
			} else {
				parent.rightChild = current.leftChild;   //��ǰ�ڵ�ʱ�ҽڵ�ʱ
			}
			
		}
		return true;
	}
	
	
	/*
	 * ǰ�����
	 */
	public void frontOrder(Node localNode){
		if(localNode != null){
			//���ʸ��ڵ�
			System.out.println(localNode.data+","+localNode.sData);
			//ǰ�����������
			frontOrder(localNode.leftChild);
			//ǰ�����������
			frontOrder(localNode.rightChild);
		}
	}
	/*
	 * �������
	 */
	public void midSort(Node localNode){
		if(localNode != null){
			//�������������
			midSort(localNode.leftChild);
			//���ʸ��ڵ�
			System.out.println(localNode.data+","+localNode.sData);
			//�������������
			midSort(localNode.rightChild);
		}
	}
	/*
	 * �������
	 */
	public void afterSort(Node localNode){
		if(localNode != null){
			afterSort(localNode.leftChild);
			afterSort(localNode.rightChild);
			System.out.println(localNode.data+","+localNode.sData);
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(30,"fm");
		tree.insert(20,"pp"); //��һ����ڵ�
		tree.insert(15,"zhangfei");
		tree.insert(40,"liuwenjie");//��һ���ҽڵ�
		tree.insert(50,"xuwenfeng");
		
		/*Node node = tree.find(40);
		if(node == null){
			System.out.println("û���ҵ�������ݣ����������");
		}
		else{
			System.out.println(node.data+","+node.sData);
		}*/
		tree.delete(40);
		tree.midSort(tree.root);
		
	}
}
