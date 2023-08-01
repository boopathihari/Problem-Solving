import java.util.Stack;

public class Binary {
    public static void maxSubStr(String str) {
        //Write your code here
        Stack<Character> stack = new Stack<>();
        int count=0;
        
        System.out.println(str.length()%2);

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

                 if(stack.isEmpty()){
                    stack.push(ch);
                    count++;
                 }else{
                    if(stack.peek() != ch){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                 }
            }

            System.out.println(count);
        
     }

     public static void main(String[] args) {
        maxSubStr("01111000101");
     }
}
