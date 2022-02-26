import java.util.*;
class arraylistint
{
public static void main(String args[])
{
ArrayList<Integer> a1=new ArrayList<Integer>();

System.out.println("initial size of a1 " +a1.size());

a1.add(55);
a1.add(56);
a1.add(57);
a1.add(58);
a1.add(59);
a1.add(60);

System.out.println("initial size of a1 "+a1.size());
System.out.println("contents of a1 "+a1);
 
Integer ia[]=new Integer[a1.size()];
ia=a1.toArray(ia);

int sum=0;

for(int i: ia)sum+=i;
System.out.println(sum);
}
}
