package Searching.Binary_Search;

public class Count_Peak_Element {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,7,5,6,1,2,9,8,7,2,1,3,7,4,5};
        int peak=0;
        if(arr[0]>arr[1]){
            peak=peak+1;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            peak=peak+1;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                peak=peak+1;
            }
    
        }
        System.out.println("total peak Element:"+peak);
    }
    

    
}
