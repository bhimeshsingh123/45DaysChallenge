// Using recursion TC(n)   SC(1)

import java.util.Stack;
public class Main
{
    public static void pushBottom(Stack<Integer> s,int element)
	{
        if(s.isEmpty){
            s.push(element);
            return;
        }
        int top = s.pop();
        pushBottom(s,element);
        s.push(top);
    }
     
	public static void main(String[] args)
	{
	    Stack<Integer> s = new Stack<>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    int element = 5;
	    pushBottom(s,element);
	    while(!s.isEmpty){
	        System.out.println(s.push()); 
	    }
		 
	}
	 
}
