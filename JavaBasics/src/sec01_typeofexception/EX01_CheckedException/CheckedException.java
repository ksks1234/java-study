package sec01_typeofexception.EX01_CheckedException;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CheckedException {
	public static void main(String[] args) {
		// Checked Exception(일반 예외)
		
		// 1. InterruptedExcetion
		Thread.sleep(1000);
		
		// 2. ClassNotFoundException
		Class cls = Class.forName("java.lang.Object");
		
		// 3. IOException
		InputStreamReader in = new InputStreamReader(System.in);
		in.read();
		
		// 4. FileNotFoundException
		FileInputStream fis = new FileInputStream("text.txt");
		
		// 5. CloneNotSupportedException
		A a1 = new A();
		A a2 = (A)a1.clone();
	}

}
