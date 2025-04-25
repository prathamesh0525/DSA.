package Searching.Binary_Search;

public class Single_Element {
    public static int Single_element(int arr[]){
        int single=-1;
        int start=0;
        int end=arr.length-1;
        if(arr.length == 1){
            return 0;
        }
        if(arr.length < 2){
            return -1;
        }

        if(arr[0]!=arr[1]){
            return 0;
        }
        if(arr[end]!=arr[end-1]){
            return end;
        }
      
        
        int low=1;
        int high=arr.length-2;

        while(low<=high){

            int mid=low+(high-low)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return mid;
            }
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
            (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        
            
           
        }
        return single;
    }
    public static void main(String[] args) {
        int arr[]={};
        int single=Single_element(arr);
        System.out.print(single);
    }
    
}
