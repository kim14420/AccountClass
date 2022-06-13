package exam8;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		String accountinformation = "";
	System.out.print("계좌정보를 입력하세요: ");
		accountinformation = in.next();
		
		
		int balance = 0;
	System.out.print("현재잔액을 입력하시오: ");
		balance = in.nextInt();
		System.out.println();
		
		in.close();
		
		double interest = 7.3;
	
		
		Account accountsetting = new Account(accountinformation, balance, interest);
		
	System.out.println(accountsetting);
		
		accountsetting.deposit(20000);	
		
	System.out.println(accountsetting);
	System.out.println("이자: " + accountsetting.Calculateinterest() * 0.1);
		
	
	}

}
