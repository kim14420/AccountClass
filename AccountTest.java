package exam8;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account("441-0290-1203", 50000, 7.3);
		
		System.out.println(account);
		
		account.deposit(2000);	
		
		System.out.println(account);
		System.out.println("이자: " + account	.Calculateinterest());
		
	
	}

}
