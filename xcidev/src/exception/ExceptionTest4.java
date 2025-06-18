package exception;

/*
 * 디버깅 하는 방법
 * - 디버그 perspective로 이동
 *   (window로 이동 또는 디버그 실행해서 화면으로 가기)
 * - 브레이크 포인트를 더블 클릭해서 잡고, 디버그 실행
 * - 실행 후 F5(메서드 in), 
 * - F6(메서드 out), 
 * - F8(다음 브레이크 포인트로 넘어가기)
 * - 디버그 종료 시 모든 브레이크 포인트 remove 하기
*/
public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            System.out.println("a() 호출전");
            a();
            System.out.println("a()호출후");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("메인 메서드의 catch블럭");
            e.printStackTrace();
        } finally {
            System.out.println("메인 메서드의 finally블럭");
        }
        System.out.println("수행완료");
    }

    public static void a() {
        try {
            System.out.println("b() 호출전");
            b();
            System.out.println("b()호출후");
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("a메서드의 catch블럭");
        } finally {
            System.out.println("a메서드의 finally블럭");
        }
    }

    public static void b() {
        try {
            System.out.println("c() 호출전");
            int x = 1;
            int y = 0;
            int z;
            z = x / y;
            System.out.println(z);
            c();
            System.out.println("c()호출후");
        } catch (NumberFormatException e) {
            e.printStackTrace();

        } finally {
            System.out.println("b메서드의 finally블럭");
        }
    }

    public static void c() {
        try {
            System.out.println("d() 호출전");
            d();
            System.out.println("d()호출후");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("c블럭");
        }
    }

    public static void d() {
        try {
            System.out.println("나누기전");
            int x = 1;
            int y = 1;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("d블럭");
        } finally {
        }
    }
}