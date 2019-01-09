package 线程;



public class Thr1 implements Runnable {

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<15;i++){
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}
