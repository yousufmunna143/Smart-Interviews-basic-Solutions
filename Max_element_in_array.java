// Find maximum element from the given array of integers.
import java.io.*;
import java.util.*;

public class Max_element_in_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // creating a scanner object to take input
        Scanner sc=new Scanner(System.in);
        // N denotes size of array and temp is variable to store a element of an array
        int N=sc.nextInt();
        int temp=sc.nextInt();
        // max variable is declared and initialized with first element of array
        int max=temp;
        // iterating through each element of array and if found greater value than present max then update max with present value
        for(int i=1; i<N; i++)
        {
            temp=sc.nextInt();
            if(temp>max)
                max=temp;
        }
        // Printing max element of the array on console
        System.out.println(max);
    }
}