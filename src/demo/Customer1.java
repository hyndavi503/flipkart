package demo;

public class Customer1 extends User
{
private String customerId;
private String address;
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void viewProfile()
{
	System.out.println(getUsername()+" "+getPassword()+" "+getEmail()+" "+getMobile()+" "+customerId+" "+address);
	}
}
