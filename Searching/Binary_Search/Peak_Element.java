package Searching.Binary_Search;

class peak_Element{
   // public static int Peak(int arr[]){

        // time complexity O(n)

    //     int peak=0;
        
    //     for(int i=1;i<arr.length-1;i++){
    //         if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
    //             peak=i;
    //         }

    //     }

    public static int Peak(int arr[]){
    int peak=0;
    int start=1;
    int end=arr.length-2;
    if(arr[0]>start){
        return 0;
    }
    if(arr[arr.length-1]>arr[end]){
        return end+1;
    }
    while(start<=end){
        int mid=start+ (end-start)/2;
        if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
            return mid;
         }
         if(arr[mid]>arr[mid-1]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
         return peak;
     }
    public static void main(String[] args) {
        int arr[]={1,2,8,7,6,5,4,3,2,1};
       System.out.println("peak element present at: "+Peak(arr)); 

    }
}