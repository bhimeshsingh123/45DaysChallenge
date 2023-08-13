// ham jante hai ki  jo bhi ham element stack me dalege or nikalege to automatic reverse hoke niklege

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> sta = new Stack<>();
        int i=0;
        while(i<s.length){            //pahle ham sare element ko array se nikal kar stack me dalege
           sta.push(s[i]);
           i++;
        }
        i=0;
        while(!sta.isEmpty()){          //phir stack ke element ko Array me dalege 
        s[i] = sta.pop();
        i++;
          }
    }
}
