public class LongestPalindrome {
    static String longestPalin(String S){
         int n=S.length();
         int i,j,length,max=0;
         String str,str1,str2="";
         for(i=0;i<n;i++)
         {
            for(j=i+1;j<n+1;j++)
            {
                if(j+max<n+1)
                {
                    str= S.substring(i,j+max);
               StringBuilder sb=new StringBuilder(str);
               sb.reverse();
               str1=sb.toString();
               if(str.equals(str1))
               {
                   length=str.length();
                   if(length>max)
                   {
                      max=length;
                      str2=str;
                   }
               }
               str="";
               str1="";
            }
                }
         }
         System.out.println(str2);
        return str2;
    }


    public static void main(String[] args) {
        
         longestPalin("aaaabbaa");
    }
}
