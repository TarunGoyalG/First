package JS;

import java.util.List;

public class EmployeeList {
private String companyname;
private String street;
private String city;
private String state;
private int pincode;
public EmployeeList(String companyname, String street, String city, String state, int pincode,
		List<String> bankaccounts, List<Employee> employees) {
	super();
	this.companyname = companyname;
	this.street = street;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	Bankaccounts = bankaccounts;
	this.employees = employees;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public List<String> getBankaccounts() {
	return Bankaccounts;
}
public void setBankaccounts(List<String> bankaccounts) {
	Bankaccounts = bankaccounts;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
private List<String>Bankaccounts;
private List<Employee> employees;





}
