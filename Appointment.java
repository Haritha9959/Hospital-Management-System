import java.sql.*;
import java.util.Scanner;

public class Appointment {

    public static void bookAppointment() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        System.out.print("Doctor Name: ");
        String doctor = sc.next();
        System.out.print("Date: ");
        String date = sc.next();

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO appointments(patient_id,doctor_name,date) VALUES(?,?,?)"
            );
            ps.setInt(1, pid);
            ps.setString(2, doctor);
            ps.setString(3, date);
            ps.executeUpdate();

            System.out.println("Appointment Booked!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
