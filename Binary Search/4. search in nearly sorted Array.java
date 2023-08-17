//is me element 3 position pe ho sakta hai :- 1. element = mid
//                                            2. element = mid-1  but mid-1 > 0
//                                            3.element = mid+1   but mid+1 < arr.length-1
public class Main
{
    public static int search(int[] arr,int target) {
        
		int s=0;
		int e = arr.length-1;
		 
		
		while(s<=e){
		  int mid = s + (e - s)/2;
		   if(arr[mid] == target){
		    return mid;
		   }
		   if(mid+1 < arr.length-1 && arr[mid+1] == target){  // mid+1 arr.length-1 se bada na ho jaye 
		    return mid+1;
		   }
		   if( mid-1 > 0 && arr[mid-1] == target){  //mid-1 0 se chota na ho jaye 
		    return mid-1;
		   }
		   else if(arr[mid] < target){  //search in right
		    s = mid+1;
	   	   }else{  //search in left
		    e = mid-1;
		  }
	   }
	   return -1;
	}
	public static void main(String[] args) {
		 int arr[] = {10, 3, 40, 20, 50, 80, 70};
		 int target = 75;
		 System.out.println("index = "+search(arr,target));
		 
	}
}
