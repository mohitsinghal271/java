import java.util.*;
class fibonacci_series
{
public static void main(String agrs[])
  {
int f=0,s=1,i,t,n;
System.out.println("enter any no. ");
Scanner in=new Scanner (System.in);
n=in.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(f);
t=f+s;
f=s;
s=t;

  }
 }
}
