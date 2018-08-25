
package demo;
public class Bank {
	
	private Account[] accounts;
	private static int count=0;
	
	public Bank(int noOfAccounts)
	{
		accounts=new Account[noOfAccounts];
	}
    public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account account)
	{
		accounts[count++]=account;
	}
	
	
	public Account getAccount(int accountId)
	{
		for(Account account:accounts)
		{
			if(account.getAccountId()==accountId)
			{
				return account;
			}
		}
		
		return null;
	}

}
