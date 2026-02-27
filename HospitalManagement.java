import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
ArrayList<Appointment> appointments = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add Patient
    public void addPatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Patient p = new Patient(id, name, age);

        patients.add(p);

        System.out.println("Patient Added Successfully");
    }

    // View Patients
    public void viewPatients() {

        for(Patient p : patients) {

            System.out.println(p.id + " " + p.name + " " + p.age);

        }

    }

    // Add Doctor
    public void addDoctor() {

        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Doctor Name: ");
        String name = sc.next();

        System.out.print("Enter Specialization: ");
        String spec = sc.next();

        Doctor d = new Doctor(id, name, spec);

        doctors.add(d);

        System.out.println("Doctor Added Successfully");

    }

    // View Doctors
    public void viewDoctors() {

        for(Doctor d : doctors) {

            System.out.println(d.id + " " + d.name + " " + d.specialization);

        }

    }

public void bookAppointment() {

    System.out.print("Enter Patient ID: ");
    int pid = sc.nextInt();

    System.out.print("Enter Doctor ID: ");
    int did = sc.nextInt();

    System.out.print("Enter Date: ");
    String date = sc.next();

    Appointment a = new Appointment(pid, did, date);

    appointments.add(a);

    System.out.println("Appointment Booked Successfully");

}
public void viewAppointments() {

    for(Appointment a : appointments) {

        System.out.println(
        "PatientID: " + a.patientId +
        " DoctorID: " + a.doctorId +
        " Date: " + a.date);

    }

}
}
