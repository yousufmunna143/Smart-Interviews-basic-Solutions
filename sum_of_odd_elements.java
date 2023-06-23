import java.io.*;
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
    }
}
