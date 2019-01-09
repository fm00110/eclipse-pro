package 多线程打印;

/*
 * t1�߳�ִ�д�ӡ����������/num�Ķ�����
 * �������t1-->i ��Ȼ����t2�̣߳���Ȼt2�̱߳����ѵ��ǲ�������ִ��printeven
 * ��Ϊt2�޷���ȡnum�Ķ�����������������ȴ�t1�߳�������Ϻ���ִ�У�t2�̵߳�ִ�з���
 * ��t1ִ������
 * 
 * 
 * 
 * 
 **/
public class Num {

	int count;
	
	public Num(int count) {

		this.count = count;
	}

	public synchronized void printOdd(){
		
		System.out.println(Thread.currentThread().getName()+"---->"+(count++));
		this.notifyAll();//���������߳�
		try {
			Thread.sleep(1000);//这是为了控制1s钟输出一个数字，以便观察
			this.wait();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}//t1�߳������޵ĵȴ�
	}
	
	public synchronized void printEven(){
		
		System.out.println(Thread.currentThread().getName()+"---->"+(count++));
		this.notifyAll();//���������߳�
		try {
			Thread.sleep(1000);//这是为了控制1s钟输出一个数字，以便观察
			this.wait();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}//t2�߳������޵ĵȴ�
	}
}
