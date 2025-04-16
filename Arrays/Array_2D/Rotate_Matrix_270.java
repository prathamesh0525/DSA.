package Arrays.Array_2D;

public class Rotate_Matrix_270 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix[i].length-1;j>=0;j--){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp; 
            }
        }

       
        
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
            
        }
        System.out.println();
       }


       
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            }
        }

   

   } 
}
   
    

