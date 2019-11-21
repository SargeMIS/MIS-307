package project;

public class Customer {
	private String CustomerName;
	private String CustomerNum;
	private boolean isMember;
	

	public Customer(String CustomerName, String CustomerNum, boolean isMember) {
		this.CustomerName = CustomerName;
		this.CustomerNum = CustomerNum;
		this.isMember = isMember;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	
	public String getCustomerNum() {
		return CustomerNum;
	}
	
	public boolean getMembership() {
		return isMember;
	}
	
	

}
