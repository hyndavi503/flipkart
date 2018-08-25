package demo;

public class Account 
{

private static int count=0;
private int accountId;
private float balance;
private Customer customer;

public Account(float balance,Customer customer)
{
	this.balance=balance;
	this.customer=customer;
	this.accountId=++count;
}

public int getAccountId() 
 {
	return accountId;
}

public void setAccountId(int accountId)
{
	this.accountId = accountId;
}

public float getBalance() 
 {
	return balance;
}

public void setBalance(float balance)
 {
	this.balance = balance;
}

public Customer getCustomer() 
 {
	return customer;
}

public void setCustomer(Customer customer) 
 {
	this.customer = customer;
}

}