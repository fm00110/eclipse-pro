package arr;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray arr = new MyArray();
		arr.insert(4);
		arr.insert(5);
		arr.insert(78);
		arr.insert(34);
		arr.print();
		System.out.println();
		//arr.delete(4);
		//arr.print();
		//int i = arr.serarch(89);
		//System.out.println(i);
		arr.update(1, 15);
		arr.print();
		
	}
}
