package demo;

public class Premium extends Customer1 
{
private String premiumCode;
private String validity;
public String getPremiumCode() {
	return premiumCode;
}
public void setPremiumCode(String premiumCode) {
	this.premiumCode = premiumCode;
}
public String getValidity() {
	return validity;
}
public void setValidity(String validity) {
	this.validity = validity;
}
public void viewProfile()
{
	System.out.println(getUsername()+" "+getPassword()+" "+getEmail()+" "+getMobile()+" "+getCustomerId()+" "+getAddress()+" "+premiumCode+" "+validity);
	}
}
