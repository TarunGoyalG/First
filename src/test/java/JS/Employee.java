package JS;

public class Employee {
private String firstname;
private String lastname;
private String gendername;
private int age;
private double salary;
private Address address;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getGendername() {
	return gendername;
}
public void setGendername(String gendername) {
	this.gendername = gendername;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String firstname, String lastname, String gendername, int age, double salary, Address address) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.gendername = gendername;
	this.age = age;
	this.salary = salary;
	this.address = address;
}



}
