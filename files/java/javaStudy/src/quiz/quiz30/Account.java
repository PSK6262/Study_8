package quiz.quiz30;

public class Account {
	private String owner;
	private long balance;
	
	Account(){}
	Account(String owner){}
	Account(long balance){}
	Account(String owner,long balance){}
	Account(long balance,String owner){}
	
	public long deposit(long amount) {
		if(amount < 1) System.out.println("입금 불가능 (입력 오류)");  
		else balance += amount;
		return balance;
	}
	public long withdraw(long amount) {
		if(balance >= amount) balance -= amount;
		else System.out.println("인출 불가능 (잔액 부족)");
		return balance;
	}
	
	long getBalance() {
		return balance;
	}
	void setBalance(long balance) {
		this.balance = balance;
	}
	String getOwner() {
		return owner;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
}
