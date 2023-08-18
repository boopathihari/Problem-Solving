public class Search2 {
    static int search(int A[], int l, int r, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
    int mid=-1,flag=0;
        while(l<= r){
             mid = (l+r) / 2;
            
            if(A[mid] == key){
                flag = 1;
                break;
            }

            if(A[mid] <= A[r]){
                if(A[mid] <= key &&   key <= A[r]){
                    l = mid +1;
                }else{
                    r = mid-1;
                }
            }else{
                if(A[l] <= key && key <= A[mid]){
                    r = mid -1;
                }else{
                    l = mid+1;
                }
            }
        }

        if(flag != 0){
            return mid;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int A[] = {4,5,6,7,0,1,2};
        int sol = search(A,0,6,3);
        System.out.println(sol);
    }
}
