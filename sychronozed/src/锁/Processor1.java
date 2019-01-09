package 锁;

public class Processor1 implements Runnable {
	Student sc;
	public Processor1(Student sc){
		this.sc=sc;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if(Thread.currentThread().getName().equals("t1")){
			sc.m1();
		}
		if(Thread.currentThread().getName().equals("t2")){
			sc.m2();
		}

	}

}
