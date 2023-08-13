
int arr[] = {8,5,7,10,3,0,4};
int ans[] = new int[arr.length];
Stack<Integer> s = new Stack<>();
int n = arr.length;
for(int i= n-1;i>=0;i--){
    //1 while
     while(s.isEmpty() && arr[s.peek()] <= arr[i]){
       s.pop();
     }
   // if else
   if(s.isEmpty()){
     ans[i] = -1;
   }else{
     ans[i] = arr[s.peek()];
   }

  //push element in stack 
   s.push(i);
}

