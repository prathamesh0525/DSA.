package Searching.Binary_Search;

public class Find_Rotate_Array {
    public static int Count(int arr[]){
        int count=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]||arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
                count=end-mid+1;
                return count;
            }
            else{
                
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,1,2,3};
        int k=Count(arr);
        System.out.println(k);

    }
    
}
