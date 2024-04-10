public class removeEveninteger {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    
        public static int[] removeEven(int[] arr){
            int oddcount = 0;
            for(int i = 0; i<arr.length;i++) {
                if(arr[i]%2!=0) {
                    oddcount++;
                }
            }
        int[] result = new int[oddcount];
        int indx = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2!=0) {
                result[indx] = arr[i];
                indx++;
            }
        }
        return result;
        }
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        printArray(arr);
       int[] result = removeEven(arr);
        printArray(result);
    }
    
}
