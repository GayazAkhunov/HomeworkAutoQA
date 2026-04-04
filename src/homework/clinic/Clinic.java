package homework.clinic;

public class Clinic {
    public static void main(String[] args){
        Patient patient = new Patient(2);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient);
    }
}
