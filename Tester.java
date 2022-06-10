import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		/*Q. Create an application called EBank. This application should have an
		Account [accNumber,name,email, phone,balance] class.
		This application should also contain a Tester class which displays the following
		menu.
		1. Add Account
		2. Display an Account
		3. Display All Accounts
		4. Remove an Account by email
		5. withdraw
		6. deposit
		7. transfer
		8. search account using name
		9. search account using email
		10.search account using phone
		11. exit.
		Use Collection to save Account objects.Use Exceptions like InvalidAccountExceptions,
		AccountNotFoundExceptions and InsufficientBalanceExceptions and implement your
		own Interface called Operations which contains addAccount,displayAccount..and So
		on.
		Create AccountUtils class to implement this Functionality and Create Tester class For
		Calling Main Method. validations on account.
		1. Name should be more than 5 characters
		2. balance should be more than 100.
		3. email should contain @
		4. phone should be of 10 digits. (consider it as a string)*/
		
		
		ArrayList<Account> accList = new ArrayList<Account>();
		Operations op;
		
		//Account a1= new Account(1234567890,"AAA","alhatpratik95@gmail.com",7387697939l,15000);
		//Account= a2= new Account()
		
		Account a1=Operations.addAccount(1234567890,"AAA","alhatpratik95@gmail.com",7387697939l,15000);
		accList.add(a1);
		
		
		System.out.println("list: "+accList);
//-----------------------------------------------------------------------------------------------------------
		
	}

}
