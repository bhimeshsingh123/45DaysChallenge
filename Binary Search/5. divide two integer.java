// divivsor * quationt + reminder = dividend 
//divivsor * quationt  = dividend 
//divivsor * mid = dividend 

public class Main
{
    public static int divideTwoInteger(int dividend,int divisor) {
        int s=0;
        int e = dividend;
        int ans =-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(divisor*mid == dividend){
                return mid;
            }else if(divisor*mid < dividend){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid -1;
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		  
	 System.out.println("index = "+divideTwoInteger(22,7));
		 
	}
}
