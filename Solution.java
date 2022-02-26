import java.util.*;
import java.lang.*;
class Solution
 {
    public static void main(String[] args)
{        
     int i,j,target,n;
    Scanner d=new Scanner(System.in);
    System.out.println("total no. of array");   
    n=d.nextInt();
    int []num=new int[n];
    System.out.println("enter the value of array ");
    for(i=0;i<n;i++)
    {
    num[i]=d.nextInt();
    }
    System.out.println("enter the value of target" );   
    target=d.nextInt();
                          
    for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
        if(num[i]+num[j]==target)
        {
            System.out.println("value of index i "+i+" value of index j "+j);
      
}
   
         }
       }
    }}