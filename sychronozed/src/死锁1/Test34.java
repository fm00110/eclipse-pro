package 死锁1;



public class Test34 {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread t1 = new Thread(new T3(o1,o2));
		Thread t2 = new Thread(new T4(o1,o2));
		
		t1.start();
		t2.start();
	}
}
