package quiz.quiz30;

public class AccountMain {

	public static void main(String[] args) {
		Account accountTest = new Account();
		accountTest.setBalance(50000);
		accountTest.setOwner("PSK");
		
		accountTest.withdraw(100000);

	}

}
