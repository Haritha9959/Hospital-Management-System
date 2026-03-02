import java.util.Scanner;

public class HospitalManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("   HOSPITAL MANAGEMENT SYSTEM   ");
        System.out.println("==================================");

        String role = Login.loginUser();

        if (role == null) {
            System.out.println("Invalid Login! Exiting...");
            return;
        }

        switch (role) {
            case "Admin":
                adminMenu();
                break;

            case "Doctor":
                doctorMenu();
                break;

            case "Receptionist":
                receptionistMenu();
                break;

            default:
                System.out.println("Unauthorized Role!");
        }
    }

    // ================= ADMIN MENU =================
    public static void adminMenu() {
        int choice;

        do {
            System.out.println("\n--- ADMIN PANEL ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Patient.addPatient();
                    break;

                case 2:
                    Billing.generateBill();
                    break;

                case 3:
                    System.out.println("Exiting Admin Panel...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }

    // ================= DOCTOR MENU =================
    public static void doctorMenu() {
        int choice;

        do {
            System.out.println("\n--- DOCTOR PANEL ---");
            System.out.println("1. View Patients (Basic Demo)");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Doctor can view patient records here.");
                    break;

                case 2:
                    System.out.println("Exiting Doctor Panel...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 2);
    }
//ReceptionMenu
    public static void receptionistMenu() {
        int choice;

        do {
            System.out.println("\n--- RECEPTIONIST PANEL ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Patient.addPatient();
                    break;

                case 2:
                    Appointment.bookAppointment();
                    break;

                case 3:
                    System.out.println("Exiting Receptionist Panel...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }
}
