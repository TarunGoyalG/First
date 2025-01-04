package J;

import java.util.List;

public class Medications {
List<MedicationsClasses> medicationClasses;

public List<MedicationsClasses> getMedicationClasses() {
	return medicationClasses;
}

public void setMedicationClasses(List<MedicationsClasses> medicationClasses) {
	this.medicationClasses = medicationClasses;
}

public Medications(List<MedicationsClasses> medicationClasses) {
	super();
	this.medicationClasses = medicationClasses;
}



}
