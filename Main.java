public class Main {
    public static void main(String[] args) {

        String role = Login.loginUser();

        if (role == null) {
            System.out.println("Invalid Login!");
        } else if (role.equals("Admin")) {
            Admin.menu();
        } else if (role.equals("Doctor")) {
            Doctor.menu();
        } else if (role.equals("Receptionist")) {
            Receptionist.menu();
        }
    }
}
