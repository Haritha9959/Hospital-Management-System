import java.sql.*;
import java.util.Scanner;

public class Billing {

    public static void generateBill() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO billing(patient_id,amount) VALUES(?,?)"
            );
            ps.setInt(1, pid);
            ps.setDouble(2, amount);
            ps.executeUpdate();

            System.out.println("Bill Generated Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
