package control;

public class 시나리오기반테스트 {
	public static void main(String[] args) {
		Customer hong = new Customer("홍길동");
		// 일반 계좌 개설
		Bank bank = Bank.getInstance();
		bank.createAccount(hong, 1000);
	}
}
