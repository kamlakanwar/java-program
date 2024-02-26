public class pattern5 {
    public static void main(String[] args) {
        int n=4, m=4;
        for(int i=n;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==4||j==4||i==j)
                {
                   System.out.print("*"); 
                }
                else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
