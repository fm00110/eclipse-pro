package 哈希表;

public class HashTable1 {

	private Info1[] infos;
	
	public HashTable1(){
		infos = new Info1[100];
	}
	//���
	public void insert(Info1 info){
		infos[info.getNum()] = info;
	}
	//ɾ��
	public void delete(int num){
	
	}
	//����
	public Info1 find(int num){
		return infos[num];
	}
	public static void main(String[] args) {
		HashTable1 ht = new HashTable1();
		ht.insert(new Info1(3,"fm"));
		ht.insert(new Info1(4,"zf"));
		ht.insert(new Info1(5,"pp"));
		ht.insert(new Info1(6,"lwj"));
		ht.insert(new Info1(99,"zxy"));
		System.out.println(ht.find(99).getName());
	}
}
