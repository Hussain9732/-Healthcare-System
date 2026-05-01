 package Smarthealthcare;

public class Main {
    public static void main(String[] args) {
        try {
            Patient p1 = new Patient("Ali Hassan Khan", 26);
            Doctor d1 = new Cardiologist("Dr. Hussain", 2000);
            Doctor d2 = new GeneralPhysician("Dr. Mohiuddin", 2500);

            Appointment a1 = new OnlineAppointment(p1, d1, "29-Aug-2025 11:30");
            a1.confirm();
            FileManager.append("appointments.txt", a1.recordLine());


            String presc = d1.generatePrescription(new Symptoms("Chest pain, fatigue"));
            FileManager.append("prescriptions.txt", presc);


            Appointment a2 = new PhysicalAppointment(p1, d2, "29-Aug-2025 14:00", "Room-102");
            try {
                a2.confirm();
                FileManager.append("appointments.txt", a2.recordLine());
            } catch (DoctorUnavailableException e) {
                System.out.println("Could not confirm physical appointment: " + e.getMessage());
                FileManager.append("appointments.txt", "FAILED | " + a2.recordLine() + " | Reason=" + e.getMessage());
            }

            System.out.println("\n--- Appointments Log ---");
            FileManager.printAll("appointments.txt");

            System.out.println("\n--- Prescriptions Log ---");
            FileManager.printAll("prescriptions.txt");

        } catch (HealthcareException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
