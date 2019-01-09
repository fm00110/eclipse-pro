package 锁1;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		Processor p1 = new Processor();
		Processor p2 = new Processor();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}
