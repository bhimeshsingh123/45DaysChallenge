class Solution {

    public int peakIndex(int[] arr) {
      int start = 0;
      int end = arr.length-1;
      while(start < end){
          int mid = start + (end - start)/2;

          if(arr[mid] < arr[mid+1]){
              start = mid + 1;
          }
          else{
              end = mid;
          }
      }
      return start;  //start and end dono likh sakte hai
    }
    public int peakIndexInMountainArray(int[] arr) {
        return peakIndex( arr);
    }
}
