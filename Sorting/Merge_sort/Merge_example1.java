package Sorting.Merge_sort;

public class Merge_example1 {
    public static void Recursion(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        Recursion(arr,start,mid);
        Recursion(arr,mid+1,end);
        Merge(arr,start,mid,end);
    }
    public static void Merge(int arr[],int start,int mid,int end){
        int len1=mid-start+1;
        int len2=end-mid;
        int temp1[]=new int[len1];
        int temp2[]=new int[len2];
        for(int i=0;i<len1;i++){
            temp1[i]=arr[start+i];

        }
        for(int i=0;i<len2;i++){
            temp2[i]=arr[mid+1+i];

        }
        int index1=0;
        int index2=0;
        int k=start;
        while(index1<len1&&index2<len2){
            if(temp1[index1]>=temp2[index2]){
                
                arr[k++]=temp2[index2];
                
                index2++;

            }
            else{
                arr[k++]=temp1[index1];
                
                index1++;
            }
        }
        while(index1<len1){
            arr[k++]=temp1[index1];
                
                index1++;

        }
        while(index2<len2){
            arr[k++]=temp2[index2];
            
            index2++;
        }



    }
    public static void main(String[] args) {
        int arr[]={4,2,7,3,1,5};
        int start=0;
        int end=arr.length-1;
        Recursion(arr,start,end);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
