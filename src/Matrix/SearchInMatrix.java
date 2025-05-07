package Matrix;
/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.


[1,3,5,7]
[10,11,16,20]
[23,30,34,60]
 */
public class SearchInMatrix {
public static boolean matrixSearch(int [][]matrix,int target){
    int n=matrix.length;
    int m=matrix[0].length;

    int low=0;int high=m*n-1;

    while(low<=high){
        int mid=(low+high)/2;
        int row=mid/m;
        int column=mid%m;
        if(matrix[row][column]==target){
           return true;
        }else if(matrix[row][column]<target)
            low=mid+1;
        else
            high=mid-1;
    }
    return false;
}
    public static void main(String[] args) {
        int [][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=7;
        System.out.println(matrixSearch(matrix,target));

    }
}
