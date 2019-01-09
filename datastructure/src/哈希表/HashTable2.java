package 哈希表;



public class HashTable2 {

	private Info2[] infos;

	public HashTable2() {
		infos = new Info2[100];
	}
	public void insert(Info2 info){
		infos[this.hashCode(info.getKey())] = info;
	}
	public int hashCode(String key){
		int hashval = 0;
		for(int i = 0;i<key.length();i++){
			int letter = key.charAt(i) - 96;
			hashval += letter;
		}
		return hashval;
	}
	public Info2 find(String key){
		return infos[hashCode(key)];
	}
	public static void main(String[] args) {
		HashTable2 ht = new HashTable2();
		ht.insert(new Info2("fm","fm"));
		ht.insert(new Info2("zf","zf"));
		ht.insert(new Info2("pp","pp"));
		ht.insert(new Info2("lwj","lwj"));
		ht.insert(new Info2("zxy","zxy"));
		System.out.println(ht.find("en").getName());
	}
}
