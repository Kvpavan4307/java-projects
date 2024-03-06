
// creating our thread using runnable interface
public class MyThread implements Runnable{
	@Override
	public void run() {
		//task for thread
		for(int i=0;i<=10;i++) {
			System.out.println("Value of i : "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		Thread t = new Thread(mythread);
		t.start();
		
		
		MyAnotherThread myanotherthread = new MyAnotherThread();
		myanotherthread.start();

	}



}
