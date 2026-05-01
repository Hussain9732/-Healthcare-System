package Smarthealthcare;

public class Cardiologist extends Doctor {
    public Cardiologist(String name, double baseFee) {
        super(name, baseFee);
    }

    @Override
    public String specialization() {
        return "Cardiologist";
    }

    @Override
    public String generatePrescription(Symptoms symptoms) {
        return "Doctor: " + getName()
                + " | Spec: Cardiologist | Advice: ECG, Beta-blocker, low-salt diet"
                + " | Notes: " + symptoms.getDetails();
    }
}
