public class pattern2 {
    public static void main(String[] args) {
        int n=6 , m=5 ;
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=5;j++){
                if(i==1 || j==1|| i==n || j==m) {
                    System.out.print("*");
                }
                else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}