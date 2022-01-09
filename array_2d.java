import java.util.*;
class array_2d
{
public static void main(String args[])
  {
int i,j;
int[][] m=new int[3][3];
System.out.println("enter nine element in matrix");
Scanner p=new Scanner (System.in);
for (i=0; i<=2; i++)
    {
for(j=0;j<=2;j++)
      {
m[i][j]=p.nextInt();
      }
    }
System.out.println("____\n");
for (i=0;i<=2;i++)
    {
for (j=0;j<=2;j++)
      {
System.out.println("\t"+m[i][j]);
      }
    }
  }
}