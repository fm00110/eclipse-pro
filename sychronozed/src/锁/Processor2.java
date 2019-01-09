package 锁;
public class Processor2 implements Runnable {


	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if(Thread.currentThread().getName().equals("t1")){
			Myclass.m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			Myclass.m2();
		}

	}

}
