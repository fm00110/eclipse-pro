package four;

public class Processor2 implements Runnable {
	Num num;
	
	public Processor2(Num num) {
		this.num = num;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
	
			num.printAdd();
		
	}

}
