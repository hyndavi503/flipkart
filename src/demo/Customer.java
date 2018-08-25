package demo;

public class Customer {

	private String name;
	private String mobile;
	private Address tempAddress;
	private Address prmtAddress;

	public String getName() 
        {
		return name;
	}

	public void setName(String name) 
        {
		this.name = name;
	}

	public String getMobile() 
        {
		return mobile;
	}

	public void setMobile(String mobile) 
        {
		this.mobile = mobile;
	}

	public Address getTempAddress()
       {
		return tempAddress;
	}

	public void setTempAddress(Address tempAddress)
        {
		this.tempAddress = tempAddress;
	}

	public Address getPrmtAddress()
       {
		return prmtAddress;
	}

	public void setPrmtAddress(Address prmtAddress)
        {
		this.prmtAddress = prmtAddress;
	}

}