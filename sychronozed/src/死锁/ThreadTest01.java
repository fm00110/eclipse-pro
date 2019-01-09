package 死锁;



public class ThreadTest01 {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		
		Processor01 p=new Processor01(o1, o2);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		
		t2.start();
		
	}

}
