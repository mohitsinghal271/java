import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<String> a1=new ArrayList<String>();

System.out.println("initial size of a1"+a1.size());

a1.add("C");
a1.add("A");
a1.add("E");
a1.add("B");
a1.add("D");
a1.add("F");
a1.add(1,"A2");

System.out.println("initial size of a1"+a1.size());
System.out.println("contents of a1"+a1);

a1.remove("F");
a1.remove(2);

System.out.println("initial size of al"+a1.size());
System.out.println("contents of a1"+a1);
}
}