import java . util.*;
public class grettings {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your choice: ");
        int button = sc.nextInt();
        switch(button) {
            case 1: System.out.println("nmesty");
            break;
            case 2: System.out.println("hello");
            break;
            case 3: System.out.println("Bonjure");
            break;
            default:
            System.out.println("you enter invalid choice");
        }
    }
}
