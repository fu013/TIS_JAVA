package gettersAndSetters;

public class Account {
	private int regNumber;	//계좌번호 
	private String name;	//소유주 이름
	private int balance;	//잔고 
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

	
}
