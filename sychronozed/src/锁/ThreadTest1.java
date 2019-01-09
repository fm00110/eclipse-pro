package 锁;

public class ThreadTest1 {
	public static void main(String[] args) throws InterruptedException {
		Student sc=new Student();
		Processor1 p=new Processor1(sc);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}

}
