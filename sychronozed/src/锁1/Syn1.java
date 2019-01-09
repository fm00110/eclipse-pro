package 锁1;

public class Syn1 {

	public static synchronized void m1(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("m1�Ѿ�ִ��");
	}
	
	public static synchronized void m2(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("m2�Ѿ�ִ��");
	}
}
