package four;

public class Proce1 implements Runnable {

	private int j=0;
	static int count = 0;
	boolean flag = false;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
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
