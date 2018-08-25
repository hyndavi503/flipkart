package demo;

public class Admin extends User
{
private String accessCode;
private String empId;
public String getAccessCode() {
	return accessCode;
}
public void setAccessCode(String accessCode) {
	this.accessCode = accessCode;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public void viewProfile()
{
	System.out.println(getUsername()+" "+getPassword()+" "+getEmail()+" "+getMobile()+" "+empId+" "+accessCode);
	}

}
