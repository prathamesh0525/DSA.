package Sorting.Merge_sort;

public class Inversion_Count {
    public static int inversion_count(int arr[]){
        int count=0;
        int start=0;
        int end=arr.length-1;
        int i=0;
        int j=1;
        while(start<=end){
            if(arr[i]>arr[j]&&i<j){
                count++;
                start++;
                j++;
                i++;
            }
            else{
                start++;
                j++;
                i++;

            }

        }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={7,8,1,2,5,3,4,0,6,9};
        int k=inversion_count(arr);
        System.out.println(k);
        
    }
    
}
