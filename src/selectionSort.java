
public class SelectionSort {
{
    static void sort(int[] arr) {
        int length = arr.length; //5
        
        for(int i=0; i<length-1 ;i++) { // 0 to 3
           int minIndx = i;
           for (int j=i+1;j<length;j++) {
               if (arr[j] < arr [minIndx]) {
                   minIndx  = j;
               }
           }
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
        }
        
    }
    

	public static void main(String[] args) {
	    int[] arr = {4,5,-3,7,12};
	    SelectionSort.sort(arr);
	    
	    for(int elm : arr) {
	       System.out.print(elm+" ");
	    }
	}
}
