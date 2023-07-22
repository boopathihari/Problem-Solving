import java.util.Arrays;

public class reverseStr {
    static String reverseWords(String S)
    {
        // code here 
        String reversedStr = "";

        String[] str = S.split("\\.");
        System.out.println(str.length);
        
        for(int i=str.length; i>0; i--){
            if(i-1 == 0){
                reversedStr += str[i-1];
                break;
            }
            reversedStr += str[i-1]+".";
            System.out.println(str[i-1]);
        }
        
        return reversedStr;
    }

    public static void main(String[] args) {
        String Str = "i.like.this.program.very.much";
        String str = reverseWords(Str);
        System.out.println(str);
    }
}
