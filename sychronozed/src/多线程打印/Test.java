package 多线程打印;

public class Test {

	public static void main(String[] args) throws Exception {
		Num num = new Num(1);
		Thread t1 = new Thread(new PrintOdd(num));
		Thread t2 = new Thread(new PrintEven(num));
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}
