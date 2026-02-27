import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HospitalManagement hm = new HospitalManagement();

        int choice;

        do {

            System.out.println("\nHOSPITAL MANAGEMENT SYSTEM");
            System.out.println("1 Add Patient");
            System.out.println("2 View Patients");
            System.out.println("3 Add Doctor");
            System.out.println("4 View Doctors");
            System.out.println("5 Book Appointment");
            System.out.println("6 View Appointments");
            System.out.println("7 Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    hm.addPatient();
                    break;

                case 2:
                    hm.viewPatients();
                    break;

                case 3:
                    hm.addDoctor();
                    break;

                case 4:
                    hm.viewDoctors();
                    break;

                case 5:
                    hm.bookAppointment();
                    break;

                case 6:
                    hm.viewAppointments();
                    break;

                case 7:https://www.onlinegdb.com/online_java_compiler#editor_1
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while(choice != 7);

    }

}
