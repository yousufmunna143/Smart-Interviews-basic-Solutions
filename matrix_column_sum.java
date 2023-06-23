/*
Given a matrix of size N x M, print column-wise sum, separated by a newline.

Input Format:
The first line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints:
1 <= N, M <= 100
-10^6 <= ar[i] <= 10^6

Output Format
Print column-wise sum of the matrix, separated by newline.

Sample Input 0:
2 2
5 -1
19 8

Sample Output 0:
24
7
 */
import java.util.*;

public class matrix_column_sum {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        int sum;
        rows=sc.nextInt();
        cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<cols; i++)
        {
            sum=0;
            for(int j=0; j<rows; j++)
            {
                sum+=matrix[j][i];
            }
            System.out.println(sum);
        }
        sc.close();    
    }
}
