package 锁;



public class Myclass {
	public synchronized static void m1(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("m1---->");
	}
	public synchronized static void m2(){
		System.out.println("m2---->");
	}

}
