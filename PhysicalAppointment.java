package Smarthealthcare;

public class PhysicalAppointment extends Appointment {
    private final String room; // e.g., "Room-102"

    public PhysicalAppointment(Patient patient, Doctor doctor, String schedule, String room) {
        super(patient, doctor, schedule);
        if (room == null || room.isBlank()) throw new IllegalArgumentException("Invalid room");
        this.room = room.trim();
    }

    @Override
    public void confirm() throws HealthcareException {
        // Simple availability rule: doctor with baseFee < 500 considered "busy"
        if (doctor.getBaseFee() < 2500) {
            throw new DoctorUnavailableException("Doctor " + doctor.getName() + " is not available for physical appointment.");
        }
        confirmed = true;
    }

    @Override
    public String recordLine() {
        return super.recordLine() + " | Room=" + room;
    }
}

