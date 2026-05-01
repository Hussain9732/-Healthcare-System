package Smarthealthcare;

public class OnlineAppointment extends Appointment {
    public OnlineAppointment(Patient patient, Doctor doctor, String schedule) {
        super(patient, doctor, schedule);
    }

    @Override
    public void confirm() {
        confirmed = true; // Always available online in this simple model
    }
}
