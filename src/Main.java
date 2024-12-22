import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String login = "admin";
        String password = "<PASSWORD>";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Login and Password:");
        String newLogin = sc.nextLine();
        String newPass = sc.nextLine();
        System.out.println(newLogin.equals(login) && newPass.equals(password) ? "Access granted" : "Access denied");
        sc.close();
    }
}