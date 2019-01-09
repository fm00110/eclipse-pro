package arr;

public class TestOrderArray {

	public static void main(String[] args) {
		MyOrderArray arr = new MyOrderArray();
		arr.insert(4);
		arr.insert(15);
		arr.insert(78);
		arr.insert(34);
		arr.insert(8);
		arr.print();
		System.out.println();
		System.out.println(arr.binbarySearch(15));
		
	}
}
