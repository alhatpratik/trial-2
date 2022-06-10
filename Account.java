
public class Account implements Operations {
	
	long accNumber;
	String name;
	String email; 
	long phone;
	float balance;

	public Account()
	{
		this.accNumber=11111;
		this.balance=5000;
		this.email = "ebank@yahoo.com";
		this.name = "Default";
		this.phone =989088888;
	}

	public Account(long accNumber, String name, String email, long phone, float balance) 
	{
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	@Override
	public void displayAccount() {
		// TODO Auto-generated method stub
		
	}
	
	
//	@Override
//	public Account addAccount(long accNumber, String name, String email, long phone, float balance) {
//		
//		Account a1 = new Account( accNumber,  name,  email,  phone,  balance);
//		
//		return null;
//	}



	
	
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}


	

	
	
}
