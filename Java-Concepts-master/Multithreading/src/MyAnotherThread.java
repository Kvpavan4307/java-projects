
// Creating thread using Thread class
public class MyAnotherThread extends Thread {
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("The value is : "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		MyAnotherThread myanotherthread = new MyAnotherThread();
		myanotherthread.start();
	}
}
