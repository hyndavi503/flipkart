package demo;

public class User 
{
private String username;
private String password;
private String email;
private String mobile;
public String getUsername() 
{
	return username;
}
public void setUsername(String username)
{
	this.username = username;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public String getPassword() 
{
	return password;
}
public void setPassword(String password)
{
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public void viewProfile()
{
	System.out.println(getUsername()+" "+getPassword()+" "+getEmail()+" "+getMobile());
	}
}
