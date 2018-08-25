package demo;
public class Form 
{
private String fullName;
private String lastName;
private String emailId;
private long mobileNum;
private Address address;

public void setFullName(String fullName)
{
	this.fullName=fullName;
	}
public String getFullName()
{
	return fullName;
}
public void setLastName(String lastName)
{
	this.lastName=lastName;
	}
public String getLastName()
{
	return lastName;
	}
public void setEmailId(String emailId)
{
	this.emailId=emailId;
	}
public String getEmailId()
{
	return emailId;
	}
public void setMobileNum(long mobileNum)
{
this.mobileNum=mobileNum;	
}
public long getMobileNum()
{
	return mobileNum;
	}
public void setAddress(Address address)
{
	this.address=address;
	}
public Address getAddress()
{
	return address;
	}
}
