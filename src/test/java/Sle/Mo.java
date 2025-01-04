package Sle;

public class Mo extends Moi {
	Mo(){
		super(15,"Sheetal");
		System.out.println("Default");
	}
/*	 public void m() {
		 System.out.println("Sultan");
	 }*/
	int a=10;
	public void mt() {
		System.out.println("Jiya");
	}
	public void ma() {
		System.out.println(this.a);
		this.mt();
	}
	 
	 public static void main(String[] args) {
		Moi p=new Mo();
		p.ma();
	}
}
