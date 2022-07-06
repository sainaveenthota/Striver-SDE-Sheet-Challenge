import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[][] setZeroes(int matrix[][]) {
        // Write your code here..
        int rows = matrix.length, cols = matrix[0].length;
        int[] ra = new int[rows], ca = new int[cols];
        Arrays.fill(ra,-1);
        Arrays.fill(ca,-1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    ra[i] = ca[j] = 0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(ra[i]==0 || ca[j]==0)
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
