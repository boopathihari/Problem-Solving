class Solution
{ 
    static class MinMax{
        int min;
        int max;
    }
    
    static MinMax getMinMax(int Arr[], int n){
        MinMax pair = new MinMax();
        
        if(n == 1){
            pair.min = Arr[0];
            pair.max = Arr[0];
            return pair;
        }
        
        
    } 
    
    public static int findSum(int A[],int N) 
    {
        MinMax pair = getMinMax(A,N);
        System.out.println("");
        
    }

    public static void main(String args[]){
        findSum(int );

    }
}
