import java.util.Stack;

public class countReversal {
   static int countRev (String s)
    {
        Stack<Character> stack = new Stack<>();
        int size = 0;
        // your code here     
        if(s.length() % 2 != 0){
            return -1;
        }
        
        int i=0;
     

        while (i < s.length()) {
            if(stack.isEmpty()&& s.charAt(i) == '}')
            {
                size++;
                stack.push('{');
            }
           else  if( s.charAt(i) == '}'){
                    stack.pop();
            }else{
                stack.push('{');
            }
            i++;
        }

            return size += (stack.size() / 2);

    }

    public static void main(String[] args) {
        int sol = countRev("}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}");
        System.out.println(sol);
    }
}
