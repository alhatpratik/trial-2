
public interface Operations {
	
	static Account addAccount(long accNumber, String name, String email, long phone, float balance)
	{
		Account a1= new Account(accNumber,name,email,phone,balance);
		
		return a1;
	}
	
	
	void displayAccount();

	
}
