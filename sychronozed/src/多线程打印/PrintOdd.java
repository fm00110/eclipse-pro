package 多线程打印;

public class PrintOdd implements Runnable{

	Num num;
	public PrintOdd(Num num){
		this.num = num;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			num.printOdd();
		}
		
	}
	
}
