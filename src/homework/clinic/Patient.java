package homework.clinic;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }
public int getTreatmentPlan(){
        return treatmentPlan;
}
public void setDoctor(Doctor doctor){
        this.doctor = doctor;
}
}
