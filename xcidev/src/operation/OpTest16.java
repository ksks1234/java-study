package operation;

public class OpTest16 {
	public static void main(String[] args) {
		/*
		 * Q. Math.random()을 이용하여
		 * 1.
		 * 	4,5,6,7,8,9,1,0,11,12,13,14,15 중의 숫자만 출력
		 * 
		 * 2.
		 * 	600,700,800,900,1000,
		 * 	1100,1200,1300,1400,1500,1600,1700,1800,1900,
		 * 	2000,2100,2200,2300 중의 숫자만 출력
		 * */
		
		// 1번 풀이
		int random = (int)(Math.random() * 12 + 4); 
		System.out.println(random);
		
		// 2번 풀이
		// 총 18개니까 * 18 해줌, 600부터 시작이니까 + 6해줌, 그리고 *100 해서 100단위 출력
		int random2 = (((int)(Math.random() * 18 ) + 6) * 100);
		System.out.println(random2);
	}

}
