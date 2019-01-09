package 同步;

public class Account {
	private String name;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String name, double balance) {
		
		this.name = name;
		this.balance = balance;
	}
	public  void draw(double money){
		synchronized(this){
		double after=balance-money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		this.setBalance(after);
	}
	}		

}
