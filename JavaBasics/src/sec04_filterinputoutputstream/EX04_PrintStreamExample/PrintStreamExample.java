package sec04_filterinputoutputstream.EX04_PrintStreamExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// File 객체 생성
		File outFile1 = new File("src/sec04_filterinputoutputstream/files/PrintStream1.txt");
		File outFile2 = new File("src/sec04_filterinputoutputstream/files/PrintStream2.txt");
		
		// 1. PrintStream(FileOutputStream(File))
		// 아래의 해당 내용이 outFile1에 입력되어 생성됨
		// 
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		// 2. PrintStream(File) 
		// 1번처럼 코드 안짜고 2번처럼 짜는 것도 가능
		// 왜냐하면, PrintStream은 out을 상속받았기 때문에 포함하고 있음
		// 그래서 flush 안해도 됨
		// 1번과 2번의 성능은 거의 차이 없음
		// outFile2 파일에 아래의 내용이 작성되어 생성됨
		try(PrintStream ps = new PrintStream(outFile2);){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		// 3. PrintStream ps = System.out
		// out을 file이 아닌 콘솔로 준 것.
		// 기본은 file 출력인데, 콘솔로 띄운 것(System.out.print)
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2)){
			
			ps.println(5.8);
			ps.print(3+ " 안녕 "+ 12345 + "\n");
			ps.printf("%d ", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch(IOException e) {}
		
		
	}
}