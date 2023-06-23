/*
Print sum of all odd elements in an array.

Input Format

First line of input contains N - the size of the array and second line contains array elements.

Constraints

1 <= N <= 100
-109 <= ar[i] <= 109

Output Format

Print sum of all odd elements of the given array.

Sample Input 0

5
6 9 8 4 3
 */
import java.util.*;

public class sum_of_odd_elements 
{
        public static void main(String[] args) 
        {
                // creating a scanner object to take input
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();
                int temp;
                int result=0;
                for(int i=0; i<size; i++)
                { 
                        /*next element is stored in temp and if temp 
                   is found odd temp is added to result */ 
                    temp=sc.nextInt(); 
                    if(temp%2 != 0)
                    {
                        result+=temp;
                    }
                }
                System.out.println(result);
                sc.close();
    }
}
