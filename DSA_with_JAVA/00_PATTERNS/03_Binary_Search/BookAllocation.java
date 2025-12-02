public class BookAllocation{
    public static boolean isPossible(int arr[] , int n , int mid){
        int students = 1;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
            if(currSum+arr[i]>mid){
                students++;
                currSum = arr[i];
                if(students>n) return false;
            }else{
                currSum+=arr[i];
            }
        }
        return true;
    }
    public static int findPages(int arr[] , int n){
        int max = 0;
        if(arr.length<n) return -1;
        int result = 0;
        for(int i=0;i<arr.length;i++){
            max+=arr[i];
        }
        int si = 0;
        int ei = max;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(isPossible(arr , n , mid)){
                result = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        // int pages[] = {2,1,3,4};
        int pages[] = { 10,20,30,40};
        int m = 2; //Number of students
        int ans = findPages(pages , m );
        System.out.println("Minimum Pages  : "+ans);
    }

}
