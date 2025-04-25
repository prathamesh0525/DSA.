package Searching.Binary_Search;

public class Searching_Rotated_Sorted_Array_II {
    public static int Rotate_Sorted(int arr[],int target){
        int position=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                position=mid;
                end=mid-1;
                 continue;
                
            }
            
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                start=start+1;
                end=end-1;
                continue;
                
            }
            
            
            
             if(arr[start]<=arr[mid]){
                if(arr[start]<=target&&target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
             }
            else{
                if(arr[mid]<=target&&target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }

        return position;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,2,3,3,3,3,3};
        int target=3;
        int k=Rotate_Sorted(arr, target);
        System.out.println(k);

    }
    
}


      
            
