//we can also reverse stack using create duplicate stack but here SC(n);

//but through this approch we can reverse Stack in SC(1);
class Solution
{ 
    static void pushAtbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int last = s.pop();
        pushAtbottom(s,data);
        s.push(last);
    }
    
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtbottom(s,top);
    }
}
