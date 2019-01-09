package 线程;



public class Thr2 implements Runnable {

	boolean run = true;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<10;i++){
			if(run){
				System.out.println(Thread.currentThread().getName()+"---->"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			
		}
	}

}
