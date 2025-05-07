package Matrix;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
 */
public class setMatrixZero {

    public static void setZeros(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;

        int row[]= new int[m];
        int column[]= new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1|| column[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }


    public static void main(String[] args) {
      int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
      setZeros(matrix);
      // The the below line is for two dimensional matrix
        //System.out.println(Arrays.deepToString(matrix));


        //The below code is for one dimensional matrix
        for(int arr[]:matrix)
            System.out.println( Arrays.toString(arr));
    }
}
