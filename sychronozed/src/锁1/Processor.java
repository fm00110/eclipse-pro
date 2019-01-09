package 锁1;



public class Processor implements Runnable {
	


	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if(Thread.currentThread().getName().equals("t1")){
			Syn1.m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			Syn1.m2();
		}
	}

}
