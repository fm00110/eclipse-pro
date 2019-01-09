package four;

public class TestNum {

	public static void main(String[] args) throws Exception {
		Num num = new Num();
		Thread t1 = new Thread(new Processor2(num));
		Thread t2 = new Thread(new Processor2(num));
		Thread t3 = new Thread(new Processor3(num));
		Thread t4 = new Thread(new Processor3(num));
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t1.start();
		Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		t3.start();
		Thread.sleep(1000);
		t4.start();
	}
}
