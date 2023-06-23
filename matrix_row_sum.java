/*
 * Given a matrix of size N x M, print row-wise sum, separated by a newline.
Note: Try to solve this without declaring/storing the matrix.

Input Format:
First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints:
1 <= N, M <= 100
-106 <= ar[i] <= 106

Output Format:
Print row-wise sum of the matrix, separated by a newline.

Sample Input 0:
2 3
5 -1 3
19 8 -5

Sample Output 0:
7
22
 */
import java.util.*;

public class matrix_row_sum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int sum=0;
        for(int i=0; i<rows; i++)
        {
            sum=0;
            /* Read element by element and add to sum variable 
            and continue the process till number of rows. */
            for(int j=0; j<cols; j++)
            {
                int next=sc.nextInt();
                sum+=next;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
