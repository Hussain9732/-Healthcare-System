package Smarthealthcare;

public class GeneralPhysician extends Doctor {
    public GeneralPhysician(String name, double baseFee) {
        super(name, baseFee);
    }

    @Override
    public String specialization() {
        return "General Physician";
    }

    @Override
    public String generatePrescription(Symptoms symptoms) {
        return "Doctor: " + getName()
                + " | Spec: GP | Advice: Rest, hydration, Paracetamol"
                + " | Notes: " + symptoms.getDetails();
    }
}
