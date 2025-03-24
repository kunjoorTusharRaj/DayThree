import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        System.out.println("enter the student details");
        Scanner s = new Scanner(System.in);
        String fname = s.next();
        String name = s.next();
        String lname = s.next();
        System.out.println("Name :"+fname+" "+name+" "+lname);
    }
}