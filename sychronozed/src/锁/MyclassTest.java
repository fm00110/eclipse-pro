package 锁;

public class MyclassTest {
	public static void main(String[] args) throws InterruptedException {
		
		Processor2 p1=new Processor2();
		Processor2 p2=new Processor2();
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p2);
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		
	}

}
