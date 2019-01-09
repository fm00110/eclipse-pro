package 同步;



public class Test {
	public static void main(String[] args) {
		Account acc=new Account("ff",5000.0);
		Processor p=new Processor(acc);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		
		t1.start();
		t2.start();
	}

}
