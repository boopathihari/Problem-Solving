public class CountAndSay {
    public static String countAndSay(int n) {
        String temp = "1";
        String tmp = "";

        if(n == 1){
            return temp;
            
        }

        for(int i=1; i<n; i++){
            int count=1;
            int len = temp.length();
            for(int j=0 ;j<len; j++){
                if(j != (temp.length()-1) && temp.charAt(j) == temp.charAt(j+1)){
                    count++;
                }else{
                    tmp += count + String.valueOf(temp.charAt(j));
                    count=1;
                }
            }
            temp = tmp;
            tmp = "";
          
        }

        return temp;

    }

    public static void main(String[] args) {
        String str = countAndSay(5);
        System.out.println(str);
    }
}
