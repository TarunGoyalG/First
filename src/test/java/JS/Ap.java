package JS;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ap {
public static void main(String[] args) throws JsonProcessingException {
	ArrayList<Employee> m=new ArrayList<>();
	m.add(new Employee("suresh","Mehra","Male",35,1000.56,new Address("Park","Vijaywada","Ap",5300212)));
	m.add(new Employee("amit","gupta","Male",30,34000.56,new Address("Plot 7","Vijaywada","Ap",5300212)));
	m.add(new Employee("aashish","das","Male",39,55000.56,new Address("Plot 8","dwarka","nd",5312)));

	EmployeeList t=new EmployeeList("xyz","arifac","rk puram","new delhi",110066,List.of("HDFC","SBI","AXIS"),m);
	
	ObjectMapper mt=new ObjectMapper();
String j=	mt.writerWithDefaultPrettyPrinter().writeValueAsString(t);
	System.out.println(j);

}
}
