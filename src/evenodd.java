import java.util.Scanner;
public class evenodd {
   public static void main(String[] args) {
    System.out.println("enter a value");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 2==0) {
        System.out.println("number is even");
    }
    else {
        System.out.println("number is add");
    }
   } 
}
