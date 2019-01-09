package 同步;


public class Processor implements Runnable {
	Account acc;
	public Processor(Account acc){
		this.acc=acc;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		acc.draw(1000.0);
		System.out.println("账户余额:"+acc.getBalance());

	}

}
