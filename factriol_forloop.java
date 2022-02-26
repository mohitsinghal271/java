import java.util.*;
class factriol_forloop
{
public static void main(String args[])
{
int i,n,fact=1;
System.out.println("Enter any no.");
Scanner in=new Scanner (System.in);
n=in.nextInt();
for (i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factriol of"+n+"is"+fact);
}
}