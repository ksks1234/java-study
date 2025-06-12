package oop5;

class Account {
	int money1;
	int money2;
	Account(int money) {
		money1 += money;
		money2 += money;
	}
	
}

class Account2 {
	static int money1;
	int money2;
	Account2(int money) {
		money1 += money;
		money2 += money;
	}
	
}
public class StaticTest {
	public static void main(String[] args) {
		System.out.println("===== static 적용 전 =====");
		Account a1 = new Account(1000);
		System.out.println(a1.money1 + " : " + a1.money2);
		Account a2 = new Account(1000);
		System.out.println(a2.money1 + " : " + a2.money2);
		Account a3 = new Account(1000);
		System.out.println(a3.money1 + " : " + a3.money2);

		System.out.println("===== static 적용 후 =====");
		System.out.println("Account2.money1 : " + Account2.money1);
		Account2 b1 = new Account2(1000);
		System.out.println(b1.money1 + " : " + b1.money2);
		Account2 b2 = new Account2(1000);
		System.out.println(b2.money1 + " : " + b2.money2);
		Account2 b3 = new Account2(1000);
		System.out.println(b3.money1 + " : " + b3.money2);
	}
	

}
