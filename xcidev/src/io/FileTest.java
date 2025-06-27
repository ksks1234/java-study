package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		String fileName;
		File oldDir = new File("C:/dev/file/test");
		// 1. 파일 이름 난수 생성 및 파일 생성
		for(int i = 1; i <= 6; i ++) {
			fileName = createFileName();
			createNewFile(oldDir, fileName+".txt");
		}
		
		// 2. 새로운 폴더 생성
		File newDir = new File("C:/dev/file/test2");
		if(!newDir.exists()) {
			newDir.mkdir();
		}
		
		// 3. 기존 dir(test)에서 newDir(test2)로 파일 복제
		// 복제시 .txt 확장자 제거
		File[] fnames = oldDir.listFiles();
		for(File fname: fnames) {
			int index = fname.getName().lastIndexOf(".txt");
			// substring이나 split을 할 때, 뒤의 확장자만 뜯는게 좋음
			// 그래서 lastIndexOf를 사용하면 좋음(많이 씀)
			fileName = fname.getName().substring(0, index);
			createNewFile(newDir, fileName);
		}
	}

	private static void createNewFile(File dir, String fileName) throws IOException {
		File newFile = new File(dir +"/"+fileName);
		newFile.createNewFile();
		System.out.println("newFile : " + newFile.exists());
		System.out.println(newFile.getAbsolutePath());
	}

	private static String createFileName() {
		// 0을 붙이는 방법
		// 1. format(%4s) 지정으로 공백에 숫자를 넣는 방법
		// 2. rand를 String으로 바꿔서 .length를 쓰는 방법
		// 3. Math.log10(int) + 1 을 쓰는 방법
		int rand = (int) (Math.random() * 9999);
		if (3 == (int) Math.log10(rand) + 1) {
			return "0" + rand;
		} else if (2 == (int) Math.log10(rand) + 1) {
			return "00" + rand;
		} else if (1 == (int) Math.log10(rand) + 1) {
			return "000" + rand;
		} else {
			return String.valueOf(rand);
		}
	}
}
