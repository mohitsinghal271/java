import java.util.*;
class hashsetdemo
{
public static void main(String args[])
{
HashSet<String> hs=new HashSet<String>();

hs.add("B");
hs.add("A");
hs.add("D");
hs.add("E");
hs.add("D");
hs.add("F");

String[] s= hs.toArray(new String[hs.size()]);

System.out.println(s[3]);
}
}