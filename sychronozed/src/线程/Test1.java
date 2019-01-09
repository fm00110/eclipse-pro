package 线程;



public class Test1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thr1());
		t1.setName("t1");
		Thread t2 = new Thread(new Thr1());
		t2.setName("t2");
		Thread t3 = new Thread(new Thr1());
		t3.setName("t3");
		Thread t4 = new Thread(new Thr1());
		t4.setName("t4");
		Thread t5 = new Thread(new Thr1());
		t5.setName("t5");
		System.out.println(Thread.currentThread().getName());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println(Thread.activeCount());
	}
}
