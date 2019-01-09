package 死锁1;



public class T4 implements Runnable {

	Object o1,o2;
	public T4(Object o1,Object o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		synchronized (o2){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			synchronized (o1) {
				
			}
		}
	}

}
