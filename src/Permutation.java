import java.util.ArrayList;
import java.util.List;

public class Permutation {
        public static void find_permutation(String str , int left, int right) {
            ArrayList<String> list = new ArrayList<>(); 

            if(left == right){
                list.add(str);
                return;
            }else{
                for(int i=left; i<= right; i++){
                    str = swap(str, left, i);
                    find_permutation(str, left+1 , right);
                    swap(str,left,i); //Backtracking
                }
            }
        }

        public static String swap(String str, int i , int j){
            char[] charArray = str.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        
            return String.valueOf(charArray);
        }
            
      
        public static void main(String[] args) {
            String str = "abc";
            find_permutation(str , 0, str.length()-1);    
            
        }
    }
    
