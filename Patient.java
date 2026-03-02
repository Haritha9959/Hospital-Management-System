import java.sql.*;
import java.util.Scanner;

public class Patient {

    public static void addPatient() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Gender: ");
        String gender = sc.next();
        System.out.print("Disease: ");
        String disease = sc.next();

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO patients(name,age,gender,disease) VALUES(?,?,?,?)"
            );
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setString(4, disease);
            ps.executeUpdate();

            System.out.println("Patient Added Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
