package gettersAndSetters;

public class Account {
	private int regNumber;	//���¹�ȣ 
	private String name;	//������ �̸�
	private int balance;	//�ܰ� 
	
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
