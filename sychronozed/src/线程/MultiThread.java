package 线程;

public class MultiThread {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					System.out.println(Thread.currentThread().getName());
				}
			});
			t.start();
		}
	}
}
