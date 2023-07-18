public class RotationString {
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        String temp = "";
        
        for(int i=0; i<s1.length(); i++){
            
            for(int j=i+1;j<s1.length() ;j++){
                    temp += s1.charAt(j);
            }

            
             temp = temp.concat(s1.substring(0,i+1));
        
            
            if(temp.equals(s2)){
                return true;

            }else{
                temp = "";
            }
            
        }
        
        return false;
    }

    public static void main(String[] args) {
       boolean sol = areRotations("mightandmagic","andmagicmigth");
        System.out.println(sol);
    }
}
