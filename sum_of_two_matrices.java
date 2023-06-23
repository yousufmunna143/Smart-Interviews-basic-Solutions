/*
Given two matrices A and B each of size N x M, print sum of the matrices (A + B)..
Note: Try solving it by declaring only a single matrix.

Input Format:
First line of input contains N, M - size of the matrices. Its followed by 2*N lines, each containing M integers - elements of the matrices. First N lines for matrix A and the next N lines for matrix B.

Constraints:
1 <= N, M <= 100
-10^9 <= ar[i] <= 10^9

Output Format:
Print sum of the 2 given matrices (A + B).

Sample Input 0:
2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12

Sample Output 0:
9 4 -3
20 6 16
 */

import java.util.*;

public class sum_of_two_matrices {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        rows=sc.nextInt();
        cols=sc.nextInt();
        int[][] mat1=new int[rows][cols];
        int[][] mat2=new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
              	mat1[i][j]=sc.nextInt();
            }
        }
         for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                  mat2[i][j]=sc.nextInt();
            }
        }
         for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                  System.out.print((mat1[i][j]+mat2[i][j]) + " ");
            }
             System.out.println();
        }
        sc.close();
    }
}