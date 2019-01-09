package 多线程打印;

public class PrintEven implements Runnable {
	Num num;
	
	public PrintEven(Num num) {

		this.num = num;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			num.printEven();
		}
	}

}
