package four;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Proce1 p = new Proce1();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(p);
		t1.start();
		Thread.sleep(500);
		t2.start();
		Thread.sleep(500);
		t3.start();
		Thread.sleep(500);
		t4.start();
	}
}
