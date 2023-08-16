//1st Approch  push() = O(n)
//             pop() = O(1)
//             peek() = O(1)

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
         
    }
    
    public void push(int x) {
        while(!empty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}


//2nd Approch  push() = O(1)
//             pop() = O(n)
//             peek() = O(n)


class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
         
    }
    
    public void push(int x) {
         s1.push(x);
    }
    
    public int pop() {
        while(!empty()){
            s2.push(s1.pop());
        }
        int result = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }
    
    public int peek() {
        while(!empty()){
            s2.push(s1.pop());
        }
        int result = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
