
public class BubbleSort
{
    static void sort(int[] arr) {
        int length = arr.length; //5
        
        for(int i=0; i<length-1 ;i++) { // 0 to 3
            for(int j=0; j<length-i-1;j++) { // 0 to 4
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    

	public static void main(String[] args) {
	    int[] arr = {4,5,-3,7,12};
	    BubbleSort.sort(arr);
	    
	    for(int elm : arr) {
	       System.out.print(elm+" ");
	    }
	}
}
