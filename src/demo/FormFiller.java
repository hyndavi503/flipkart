package demo;
import java.util.Scanner;
public class FormFiller
{
	private Scanner scanner;
	private Form form;
	private FormDisplay display;
	
public FormFiller()
{
	scanner=new Scanner(System.in);
	form=new Form();
	}

public void fillForm()
{
	System.out.println("enter fullName");
	String fullName=scanner.nextLine();
	System.out.println("enter lastName");
	String lastName=scanner.nextLine();
	System.out.println("enter emailId");
	String emailId=scanner.nextLine();
	System.out.println("enter mobilNum");
	long mobileNum=scanner.nextLong();	
	form.setFullName(fullName);
	form.setLastName(lastName);
	form.setEmailId(emailId);
	form.setMobileNum(mobileNum);
    scanner.nextLine();
    
	Address add=new Address();
	System.out.println("enter streetName");
	add.setStreet(scanner.nextLine());
	System.out.println("enter doorNum");
	add.setDoorNo(scanner.nextLine());
	System.out.println("enter city");
	add.setCity(scanner.nextLine());
	System.out.println("enter state");
	add.setState(scanner.nextLine());
	System.out.println("enter pin");
	add.setPin(scanner.nextInt());
	form.setAddress(add);
	}

public FormDisplay submitDisplay()
{
	FormDisplay displayer=new FormDisplay(form);
	return displayer;
	}
}
	
