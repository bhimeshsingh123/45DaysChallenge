// TC(n) SC(n);

class Solution {
    public boolean isValid(String s) {
      // Declare stack 
      Stack<Character> sta = new Stack<>();
      sta.push('a');
      // check String length is 1 so return false
      if(s.length()==1) return false;
  

      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          if(ch=='(' || ch=='{' || ch=='['){
              sta.push(ch);
          }
          if(ch==')'){
            if(sta.peek()=='(')  sta.pop();
            else return false;
          }
          if(ch==']'){
             if(sta.peek()=='[')  sta.pop(); 
             else return false; 
          }
          if(ch=='}'){
             if(sta.peek()=='{')  sta.pop(); 
             else return false;
          }
      }
      if(sta.peek()=='a')   return true;
      else return false ; 
    }
}
