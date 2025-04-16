package Searching.Binary_Search;
public class First_occurance {
    public static int First_ccurance(int[]arr,int target){
        int position=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
             if(arr[mid]>=target){ 
                position=mid;
                
                end=mid-1;
            }
            else{
                start=mid+1;
                
            }
        }

        return position;
    }
    

    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9};
        int target=8;
        int First=First_ccurance(arr,target);
        System.out.println("First_Occurance  is :"+First);
    }
    
}
