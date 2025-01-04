package TClass;

public class Constructor {
int a; String b;
Constructor(int c,String m){
	a=c;
	b=m;
}
public void m() {
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	Constructor p=new Constructor(56,"aman");
	p.m();
}
}
