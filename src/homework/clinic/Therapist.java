package homework.clinic;

public class Therapist implements Doctor{

    @Override
    public void toHeal() {
        System.out.println("Терапевт назначает лечение.");

    }

    public void appointDoctor(Patient patient){
        Doctor doctor;
        switch (patient.getTreatmentPlan()){
            case 1:
                doctor = new Surgeon();
                break;
            case 2:
                doctor= new Dentist();
                break;
            default:
                doctor = new Therapist();
        }
        patient.setDoctor(doctor);
        doctor.toHeal();
    }
}