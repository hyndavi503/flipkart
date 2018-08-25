package demo;

public class FormDisplay 
{
private Form form;

	public FormDisplay(Form form)
{
		this.form=form;
}
	public void display()
	{
		System.out.println("Name:"+form.getFullName()+""+form.getLastName());
		System.out.println("emailId:"+form.getEmailId());
		System.out.println("mobileNum:"+form.getMobileNum());
		System.out.println("address:"+form.getAddress().getDoorNo()+" "+form.getAddress().getStreet()+" "+form.getAddress().getCity()+" "+form.getAddress().getState()+" "+form.getAddress().getPin());
	}
	
	
}
