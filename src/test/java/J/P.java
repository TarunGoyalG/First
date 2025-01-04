package J;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class P {
public static void main(String[] args) throws JsonProcessingException {
	ArrayList<Drug>asociatedDrug=new ArrayList<>();
	asociatedDrug.add(new Drug("asprin","","500mg"));
	ArrayList<Drug>asociatedDrug2=new ArrayList<>();
	asociatedDrug2.add(new Drug("somethingElse","","500mg"));
	ArrayList<ClassName>classname=new ArrayList<>();
	classname.add(new ClassName(asociatedDrug,asociatedDrug2));
	ArrayList<MedicationsClasses> m=new ArrayList<>();
	m.add(new MedicationsClasses(classname));
	ArrayList<Medications> mp=new ArrayList<>();
	mp.add(new Medications(m));
	ObjectMapper t=new ObjectMapper();
	
	System.out.println(t.writerWithDefaultPrettyPrinter().writeValueAsString(mp));
	
	
	
	
}
}
