package 死锁;



public class Processor01 implements Runnable {
    Object o1,o2;

	public Processor01(Object o1, Object o2) {

		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if(Thread.currentThread().getName().equals("t1")){
			synchronized (o1) {
				try {
					Thread.sleep(1000);
					synchronized (o2) {
						
					}
					
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		if(Thread.currentThread().getName().equals("t2")){
			synchronized (o2) {
				try {
					Thread.sleep(1000);
					synchronized (o1) {
						
					}
					
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
