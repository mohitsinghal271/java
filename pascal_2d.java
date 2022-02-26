import java.util.*;
class pascal_2d
{
public static void main(String args[])
{
int i=0,j=0,numRows;
Scanner d=new Scanner(System.in);
numRows=d.nextInt();
numRows=d.nextInt();
for(i=0;i<numRows;++i) 
{
for(j=0;j<=i;++j)
{
if(j==0 || j==i)
{
System.out.println(1);
}
else
{
System.out.println((j-1)+(j));
}
}
}
}
}