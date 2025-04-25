package Sorting.Merge_sort;

public class Median_2Array {
    public static int[] merge(int[]arr,int arr1[]){
        int Merge[]=new int[arr.length+arr1.length];
        int s1=0;
        int s2=0;
        int start=0;
        while(s1<arr.length&&s2<arr1.length){
            if(arr[s1]<arr1[s2]){
                Merge[start++]=arr[s1];
                s1++;

            }
            else{
                Merge[start++]=arr1[s2];
                s2++;
            }
        }
        while(s1<arr.length){
            Merge[start++]=arr[s1];
            s1++; 
        }
        while(s2<arr1.length){
            Merge[start++]=arr1[s2];
                s2++;                       
        }
        return Merge;
    }
    public static float Median(int[] arr){
        int med=-1;
        int start=0;
        int end=arr.length-1;
        int n=arr.length;
        if(arr.length%2==1){
         med=start+(end-start)/2;
         return arr[med];
        }
        else{
            med= start+(end)/2;
          
            return (float)(arr[n/2 - 1] + arr[n/2]) / 2;
            
        }
    }
    public static void main(String[] args) {
       int arr[]={1,3,5};
       int arr1[]={0,2,4,6};
       int []Merge1=merge(arr,arr1);
       for(int i=0;i<Merge1.length;i++){
        System.out.print(Merge1[i]+" ");
       }
       float median=Median(Merge1);
       System.out.println(median);
        
    }
    
}
