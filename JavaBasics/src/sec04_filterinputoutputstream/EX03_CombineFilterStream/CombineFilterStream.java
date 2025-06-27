package sec04_filterinputoutputstream.EX03_CombineFilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CombineFilterStream {
	public static void main(String[] args) throws IOException {
		
		//파일 생성
		File dataFile = new File("src/sec04_filterinputoutputstream/files/file2.data");
		
		//데이터 쓰기 (DataOutputStream)
		// 쓸 때는 데이터 -> 버퍼 순서로 쓰기
		try(OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();			
		}		
		
		//데이터 읽기 (DataInputStream)
		// 처음에 들어오는 InputStream이 중요함
		// 필터는 순서 바뀌어도 괜찮음
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);){
			
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
	
		}	
	}
}