package demo;
import java.util.Scanner;
public class Main1 
{
	public static void main(String args[])
	{
		User user=new User();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username");
		user.setUsername(scanner.nextLine());
		System.out.println("enter password");
		user.setPassword(scanner.nextLine());
		System.out.println("enter email");
		user.setEmail(scanner.nextLine());
		System.out.println("enter mobile");
		user.setMobile(scanner.nextLine());

		
		Admin admin=new Admin();
		System.out.println("enter username");
		admin.setUsername(scanner.nextLine());
		System.out.println("enter password");
		admin.setPassword(scanner.nextLine());
		System.out.println("enter email");
		admin.setEmail(scanner.nextLine());
		System.out.println("enter mobile");
		admin.setMobile(scanner.nextLine());
		System.out.println("enter accessCode");
		admin.setAccessCode(scanner.nextLine());
		System.out.println("enter empId");
		admin.setEmpId(scanner.nextLine());
		
		Customer1 customer=new Customer1();
		System.out.println("enter username");
		customer.setUsername(scanner.nextLine());
		System.out.println("enter password");
		customer.setPassword(scanner.nextLine());
		System.out.println("enter email");
		customer.setEmail(scanner.nextLine());
		System.out.println("enter mobile");
		customer.setMobile(scanner.nextLine());
		System.out.println("enter customerId");
		customer.setCustomerId(scanner.nextLine());
		System.out.println("enter address");
		customer.setAddress(scanner.nextLine());
		
		Premium premium=new Premium();
		System.out.println("enter username");
		premium.setUsername(scanner.nextLine());
		System.out.println("enter password");
		premium.setPassword(scanner.nextLine());
		System.out.println("enter email");
		premium.setEmail(scanner.nextLine());
		System.out.println("enter mobile");
		premium.setMobile(scanner.nextLine());
		System.out.println("enter customerId");
		premium.setCustomerId(scanner.nextLine());
		System.out.println("enter address");
		premium.setAddress(scanner.nextLine());
		System.out.println("enter premiumCode");
		premium.setPremiumCode(scanner.nextLine());
		System.out.println("enter validity");
		premium.setValidity(scanner.nextLine());
		
		user.viewProfile();
		admin.viewProfile();
		customer.viewProfile();
		premium.viewProfile();
		}

}
