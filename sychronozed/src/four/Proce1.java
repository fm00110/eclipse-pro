package four;

public class Proce1 implements Runnable {

	private int j=0;
	static int count = 0;
	boolean flag = false;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		if(!flag){
			j++;
			System.out.println("j++");
		}
		if(flag){
			j--;
			System.out.println("j--");
		}
		count++;
		System.out.println(count);
		if(count >= 2){
			flag=true;
		}
	}

}
