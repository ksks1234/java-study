package oop11b;

import java.io.FileInputStream;
import java.util.Properties;

// 파일을 읽어오는 부분(instance 생성 부분 분리)
// 공통 사용 부분을 utility로 분리
// 심플 팩토리 패턴 활용
public class productReader {
	// simple factory pattern 구조안에서
	// 설정값을 읽기 위한 책임을 분리해낸 유틸리티 클래스
	private static Properties props = new Properties();
	
	static {
		try {
			props.load(new FileInputStream("src/oop11b/product.properties"));
		} catch (Exception e) { // Exception이 상위 exception. 업캐스팅으로 잡음
			// Throwable : 최상위 예외 클래스, 쓰는 상황은 한정되어 있음
			e.printStackTrace();
		}
	}

	public static String getValue(String key) {
		return props.getProperty(key);
		// ex) oop11b.SamsungTV 리턴됨
	}

}
