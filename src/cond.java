import java.util.*;
public class cond {
    public static void main(String[]args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for vote");
        }
            else {
                System.out.println("you are not eligible for vote");
            }
        }
    }
