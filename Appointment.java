package Smarthealthcare;

public abstract class Appointment {
    protected final Patient patient;
    protected final Doctor doctor;
    protected final String schedule; // e.g., "29-Aug-2025 11:30"
    protected boolean confirmed;

    public Appointment(Patient patient, Doctor doctor, String schedule) {
        if (patient == null || doctor == null) throw new IllegalArgumentException("Null entities");
        if (schedule == null || schedule.isBlank()) throw new IllegalArgumentException("Invalid schedule");
        this.patient = patient;
        this.doctor = doctor;
        this.schedule = schedule.trim();
    }

    public abstract void confirm() throws HealthcareException;

    public String recordLine() {
        return "APPT | Doctor=" + doctor.getName()
                + " (" + doctor.specialization() + ")"
                + " | Patient=" + patient.getName()
                + " | Age=" + patient.getAge()
                + " | Schedule=" + schedule
                + " | Confirmed=" + confirmed;
    }
}