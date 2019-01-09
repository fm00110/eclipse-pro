package four;

public class Num {

	int j = 1;
	public Num(){
		
	}
	
	public synchronized void printAdd(){
		System.out.println(Thread.currentThread().getName()+"----->"+(j++)+"---->执行j++");
		
	}
	
	public synchronized void printReduce(){
		System.out.println(Thread.currentThread().getName()+"----->"+(j--)+"---->执行j--");
	}
}
