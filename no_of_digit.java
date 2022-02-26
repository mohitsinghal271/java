import java.util.*;
class no_of_digit
{
public static void main(String agrs[])
  {
int n,count=0;
System.out.println("write any no.to find no. of digit");
Scanner in=new Scanner (System.in);
n=in.nextInt();
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
 }
}
