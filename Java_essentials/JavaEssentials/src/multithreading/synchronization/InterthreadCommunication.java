package multithreading.synchronization;

public class InterthreadCommunication {
	public static void main(String args[]) throws Exception{
		try {
			myThread m = new myThread();
			synchronized (m) {
				System.out.println("Started");
				m.start();
				System.out.println("Thread started");
				m.wait();
			}
				
		// 1 lakh lines of code
			
			//1 lakh lines of code
			System.out.println(m.total);
			
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}

 class myThread extends Thread{
	int total =0;
	public  void run() {
		try {
		synchronized(this) {
			System.out.println("Started the engine");
			for(int i =1; i<=100;i++) {
				//System.out.println("Hi"+i);
				total+=+i;
			}
			this.notify();
		}
		for(int i =1; i<=10000000;i++) {
		/*
			 * //System.out.println("Hi"+i); total+=+i;
			 */
		}
			
			System.out.println("I am finished");
			/* } */
	}catch(Exception e) {
		e.printStackTrace();
	}
}
 }
