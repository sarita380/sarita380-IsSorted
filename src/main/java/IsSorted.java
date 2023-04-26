public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int max= arr[0];
        int min =arr[0];
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0 || arr[i]==1){
                return true;
             }
             if(arr[i] > max){
          
                return true;
             }  if(arr[i]< min){
                return false;
             }
        }
        return false;
    }
}
