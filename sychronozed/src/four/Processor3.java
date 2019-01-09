package four;

public class Processor3 implements Runnable {
	
	Num num;
	
	public Processor3(Num num) {
		this.num = num;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
	
			num.printReduce();
	
	}

}
