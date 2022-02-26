import java.util.*;
class prime_number
{
public static void main(String agrs[])
  {
int i=2,n;
System.out.println("enter any no. ");
Scanner in=new Scanner (System.in);
n=in.nextInt();
while(i<n)
    {
if (n%i==0)
       {
System.out.println("not prime");
break;
       }
i++;
    }
if (i==n)
    {
System.out.println("prime");
    }
  }
}