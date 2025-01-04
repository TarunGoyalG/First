package Construct;

public class Child extends Parent {
	  String name = "Child";

	    Child() {
	     //   super(); // Calls Parent constructor
	        System.out.println("Child Constructor");
	    }

	    void show() {
	        System.out.println("Name from Child: " + this.name);  // Refers to Child's name
	        System.out.println("Name from Parent: " + super.name); // Refers to Parent's name
	    }

	    @Override
	    void display() {
	        super.display(); // Calls Parent's display method
	        System.out.println("Display from Child");
	    }
	

	
	    public static void main(String[] args) {
	        Child child = new Child();
	        child.show();
	        child.display();
	    }
}
