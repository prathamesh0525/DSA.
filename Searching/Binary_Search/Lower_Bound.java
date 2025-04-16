package Searching.Binary_Search;

public class Lower_Bound {
    public static int Lower_Bound(int[]arr,int target){
        int position=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<=target){
                position=arr[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return position;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=-90;
        int lower=Lower_Bound(arr,target);
        System.out.println("lower bound element is :"+lower);
    }
    
}
