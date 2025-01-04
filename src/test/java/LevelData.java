
public class LevelData {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDisplayOrder() {
	return displayOrder;
}
public void setDisplayOrder(int displayOrder) {
	this.displayOrder = displayOrder;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
public Points getPoints() {
	return points;
}
public void setPoints(Points points) {
	this.points = points;
}
private int displayOrder;
private String icon;
private Points points;
public LevelData(String name, int displayOrder, String icon, Points points) {
	super();
	this.name = name;
	this.displayOrder = displayOrder;
	this.icon = icon;
	this.points = points;
}

}
