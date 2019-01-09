package 锁;

public class Student {
	public synchronized void m1(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("m1---->");
	}
	public synchronized void m2(){
		System.out.println("m2---->");
	}

}
