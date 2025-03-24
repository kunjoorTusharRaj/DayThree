import java.util.Scanner;

public class drive {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>18){
            System.out.println("you can drive");
        }else{
            System.out.println("you cant drive");
        }
    }
}