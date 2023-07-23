public class LongestPlai {

    static String subString(String str, int start, int end){
        return str.substring(start, end);
    }

    static String LongPali(String str){
        int start=0,low=0;
        int n = str.length();
        int[][] table = new int[n][n];
        
        int maxlength = 1;
        for(int i=0; i<n; i++){
            table[i][i] = 1;
        }

        int flag=0,count=0;
        for(int i=0; i<n-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                table[i][i+1] = 1;
                start = i;
                maxlength=2;
                flag++;
                count++;
            }
            if(flag == 1 && count==1){
                low = i;
            System.out.println(low);
                flag = 0;
           }
        }

       

        for(int k=2 ; k<n; k++){

            for(int i=0; i<n-k+1; i++){

                int j = i+k-1;

                if( table[i+1][j-1] == 1 && str.charAt(i) == str.charAt(j)){
                        table[i][j] = 1;

                        if(k > maxlength){
                            start = i;
                            maxlength = k;
                        }
                }
            }
        }

       
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+table[i][j]+" ");
            }
            System.out.println();
        }


         if(maxlength == 2){
            String sol = subString(str,low,low+maxlength);
            System.out.println(low);

            return sol;
        }


        String sub = subString(str,start,start+maxlength);
        System.out.println(start);
        System.out.println(maxlength);

       return sub;

    }


    public static void main(String[] args) {
        String str = "kjqlrzzfmlvyoshiktodnsjjp";
        String sol = LongPali(str);
        System.out.println(sol);
    }
}
