//push() = TC(1)
//pop() = TC(n)
//peek() = TC(n)

 
class MyStack {

     Queue<Integer> q1 = new LinkedList<>();
     Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){ //q1 me element hai to usme dalege
            q1.add(x);
        }else{
            q2.add(x);  //nhi to q2 me dalege
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){      //q1 me element hai to usme se remove karege
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{   //nhi to q2 me se remove karege
             while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
    
    public int top() {
          if(empty()){
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                 
                q2.add(top);   //last vala remove karege
            }
        }else{
             while(!q2.isEmpty()){
                top = q2.remove();
                
                q1.add(top);
            }
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();  //jab dono queue khali ho tab
    }
}
