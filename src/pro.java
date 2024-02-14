import java.util.*;
public class pro {
    public static void main(String[] args)
     {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("enter the value of a and b:");
     int a = sc.nextInt();
     int b = sc.nextInt();
        if(a==b) {
            System.out.println("equal");
        }
        else if(a<b){
            System.out.println("a is lesser");
        }
        else {
                System.out.println("a is greater");
        }
    }
}