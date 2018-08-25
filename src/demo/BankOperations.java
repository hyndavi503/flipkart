package demo;

import java.util.Scanner;

public class BankOperations {
	
	private Bank bank;
	private Scanner scanner;
	public BankOperations()
	{
		System.out.println("Enter number of Accounts");
		scanner=new Scanner(System.in);
		bank=new Bank(scanner.nextInt());
		scanner.nextLine();
	}
	
	
	
	public void menu()
	{
		 System.out.println("1.Add Account\n2.Display Account\n3.Display All Accounts\n4.Exit");
		 System.out.println("Choose option");
		 int option=scanner.nextInt();
		 scanner.nextLine();
		 switch(option)
		 {
		 	case 1: createAccount();
		 	    break;
		 	case 2:displayAccount();
		 	   break;
		 	case 3:displayAllAccounts();
		 	   break;
		 	case 4:System.exit(0);
		 	   break;
		 	default: System.out.println("Choose correct option");
		 }
		 
		 menu();
	}
	
	public void createAccount()
	{
		
		Customer customer= createCustomer();
		setAddress(customer);
		
		
		System.out.println("Enter min Bal:");
		float bal=scanner.nextFloat();
		
		Account account=new Account(bal,customer);
		bank.addAccount(account);
	}
	
	
	private Customer createCustomer()
	{
		Customer customer=new Customer();
		System.out.println("Enter Customer Name:");
		String name=scanner.nextLine();
		System.out.println("Enter Mobile Number:");
		String mobile=scanner.nextLine();
		customer.setName(name);
		customer.setMobile(mobile);
		
		return customer;
		
	}
	
	
	private void setAddress(Customer customer)
	{
		System.out.println("Enter Door Number");
		String doorNo=scanner.nextLine();
		System.out.println("Enter Street Name:");
		String street=scanner.nextLine();
		System.out.println("Enter city Name:");
		String city=scanner.nextLine();
		Address tempAddress=new Address();
		tempAddress.setDoorNo(doorNo);
		tempAddress.setStreet(street);
		tempAddress.setCity(city);
		customer.setTempAddress(tempAddress);
		
	}
	
	
	public void displayAccount()
	{
		System.out.println("Enter Account Id:");
		int accountId=scanner.nextInt();
		scanner.nextLine();
		
		Account account=bank.getAccount(accountId);
		
		if(account!=null)
		{
			System.out.println("Account Id: "+account.getAccountId());
			System.out.println("Account Balance: "+account.getBalance());
			System.out.println("Account Holder Name: "+account.getCustomer().getName());
		}else
		{
			System.out.println("Wrong account Number");
		}
	}
	
	
	public void displayAllAccounts()
	{
		
	}
	
    

}