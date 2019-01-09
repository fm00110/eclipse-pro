package 线程;



/*
 * �ж�һ���߳�
 * 
 */

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Thr2 tr = new Thr2();
		Thread t = new Thread(tr);
		t.start();
		
		Thread.sleep(5000);
		tr.run = false;
	}
}
