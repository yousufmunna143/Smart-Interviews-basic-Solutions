/*
Given a matrix of size N x M, print transpose of the matrix.

Input Format

First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints

1 <= N, M <= 100
-109 <= ar[i] <= 109

Output Format

Print the transposed of the given matrix.

Sample Input 0

2 2
5 -1
19 8
Sample Output 0

5 19
-1 8
 */
import java.util.*;

public class transpose_matrix
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        long[][] matrix=new long[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                matrix[i][j]=sc.nextLong();
            }
        }
        for(int i=0; i<cols; i++)
        {
            for(int j=0; j<rows; j++)
            {
                System.out.print((matrix[j][i])+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}