

class UserThread extends Thread{
	public void run() {
		System.out.println("This is user define thread");
	}
}
public class ThreadOperation {
	
	public static void main(String[] args) {
		System.out.println("Program started...");
		int x=56+234;
		System.out.println("sum is "+x);
		//Thread...
		Thread t =Thread.currentThread();
		String tName= t.getName();
		System.out.println("Current running thread is : "+tName);
		
		//setName
		t.setName("MyMain");
		System.out.println(t.getName());
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t.getId());
		
		//going to start user defined thread
		UserThread thread = new UserThread();
		thread.start();
		System.out.println("Program ended....");
	}

}
