import java.util.Stack;

public class param {
     static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<x.length(); i++){
            if(stack.isEmpty()){
               stack.push(x.charAt(i)); 
            }else{
                char c = x.charAt(i);
                char s = stack.peek();
                if((c == ']') && (s == '[')){
                    stack.pop();
                }else if((c == ')') && (s == '(')){
                    stack.pop();
                }else if((c == '}') && (s == '{')){
                    stack.pop();
                }else{
                    stack.push(x.charAt(i));
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        String str = "[(])";
        boolean sol = ispar(str);
        System.out.println(sol);
    }
}
