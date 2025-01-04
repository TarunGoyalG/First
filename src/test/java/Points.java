
public class Points {
private Promote promotional;
public Promote getPromotional() {
	return promotional;
}
public void setPromotional(Promote promotional) {
	this.promotional = promotional;
}
public Promote getSafety() {
	return safety;
}
public void setSafety(Promote safety) {
	this.safety = safety;
}
public Promote getDemotion() {
	return demotion;
}
public void setDemotion(Promote demotion) {
	this.demotion = demotion;
}
private Promote safety;
private Promote demotion;
public Points(Promote promotional, Promote safety, Promote demotion) {
	super();
	this.promotional = promotional;
	this.safety = safety;
	this.demotion = demotion;
}


}
