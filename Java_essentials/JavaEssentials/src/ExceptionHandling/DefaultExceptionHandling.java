package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		try {
		DefaultExceptionHandling d = new DefaultExceptionHandling();
		d.updateRecordStatus();
		//PrintWriter p = new PrintWriter("meena.txt");
		//p.write("myName");
		//d.doMoreStuff();
		//d.test();
		/*
		 * System.out.println(10/0);
		 */		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
	}
	private void doStuff() {
		doMoreStuff();
		System.out.println("world");

	}
	private void doMoreStuff() throws ArithmeticException{
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void test() throws ArithmeticException {
		System.out.println(10/0);
	}


public boolean updateRecordStatus() 
		 {
	boolean updateStatus = false;
	try {
		PrintWriter p = new PrintWriter("javaEssential.txt");
		p.write("Meena");
		//System.out.println(10/0);

	} catch (Exception exception) {
		exception.printStackTrace();
	} finally {
		
	}
	return updateStatus;
}

}