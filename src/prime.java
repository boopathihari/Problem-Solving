public class prime {
    static Boolean isPrime(int no){
        for(int i=2; i<=no/2; i++){
            if(no % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        if(n == 0 || n == 1){
            return 0;
        }
        int count=0;


        boolean[] arr = new boolean[n];


        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        arr[0] = false;
        arr[1] = false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime(i)){
                for(int j= i*i ; j< n ; j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int sol = countPrimes(5);
        System.out.println(sol);
    }
}
