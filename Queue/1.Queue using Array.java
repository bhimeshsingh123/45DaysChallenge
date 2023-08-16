public class queue{
     int arr[];
     int rear;
     int front = 0;
     int size = 5;
     queue(int n){
         arr = new int[5];
         rear = -1;
         
     }
      
     public boolean isFull(){
         if(rear == size-1) return true;
         else return false;
     }
     public boolean isEmpty(){
         if(rear == -1) return true;
         else return false;
     }
     public void add(int data){
         if(isFull()){
             System.out.println("Queue is full");
             return;
         }
         rear = rear+1;
         arr[rear] = data;
     }
     
     public int remove(){
         if(isEmpty()){
             System.out.println("Queue is empty");
         }
         int result  = arr[front];
         for(int  i=0;i<arr.length-1;i++){
             arr[i] = arr[i+1];
         }
         rear = rear-1;
         return result;
     }
     
     public int peek(){
         if(isEmpty()) {
             System.out.println("Empty");
             return -1;
         }
         int result = arr[front];
         return result;
     }
 }

//main class

public class Main
{
	public static void main(String[] args) {
		queue q = new queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
     	System.out.println("Removed = "+q.remove());
  		System.out.println("Removed = "+q.remove());
// 		q.add(4);
// 		q.add(5);
// 		q.add(6);
		
 		while(!q.isEmpty()){
 		   System.out.println(q.remove());
 		}
			System.out.println("peek is = "+q.peek());
	
	}
}
