
package Smarthealthcare;

public abstract class Doctor extends Person {
    private double baseFee;

    public Doctor(String name, double baseFee) {
        super(name);
        if (baseFee <= 0) throw new IllegalArgumentException("Invalid fee");
        this.baseFee = baseFee;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public abstract String specialization();
    public abstract String generatePrescription(Symptoms symptoms);
}
