package four;

public class Processor2 implements Runnable {
	Num num;
	
	public Processor2(Num num) {
		this.num = num;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
	
			num.printAdd();
		
	}

}
