package J;

public class Drug {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDose() {
	return dose;
}
public void setDose(String dose) {
	this.dose = dose;
}
public String getStrength() {
	return strength;
}
public void setStrength(String strength) {
	this.strength = strength;
}
private String dose;
private String strength;
public Drug(String name, String dose, String strength) {
	super();
	this.name = name;
	this.dose = dose;
	this.strength = strength;
}
	






	
}
