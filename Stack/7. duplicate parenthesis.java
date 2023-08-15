// TC(n)  SC(n)

// check in this String have duplicates parenthesis or not 
import java.util.Stack;
public class Main
{
    public static boolean checkdupparen(String str){
        Stack<Character> s = new Stack<>();
	    
	    for(int i=0;i<str.length();i++){
	        char ch = str.charAt(i);
	       // agar opening,oprands and operator hai to push karege 
	        if( ch!=')')  s.push(ch);
	      //agar closing hai to while se check karege ki opening( or closing ) ke bich me element hai ya nhi hai 
          //  to opening braket ko pop kar dege nhi to true return kar dege
	        else{
	            int count = 0;
	            while(s.peek()!='('){
	                s.pop();
	                count++;
	            }
	            if(count<1){
	                return true ;
	            }
	            else{
	                s.pop();
	            }
	        }
	    }
	    return false;
        
    }
	public static void main(String[] args) {
	    String str = new String("(a+b)+((a+b))");
		System.out.println(checkdupparen(str));
	}
}

