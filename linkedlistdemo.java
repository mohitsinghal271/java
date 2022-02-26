import java.util.*;
class linkedlistdemo
{
public static void main(String args[])
{
LinkedList<String> l1=new LinkedList<String>();

l1.add("M");
l1.add("O");
l1.add("H");
l1.add("I");
l1.add("T");
l1.addLast("A");
l1.addFirst("K");

l1.add(1,"A2");

System.out.println("contents of l1 "+l1);

l1.remove("H");
l1.remove(2);

System.out.println("contents of l1 after deletion "+l1);

l1.removeFirst();
l1.removeLast();

System.out.println("contents of l1 after first and last deletion "+l1);


String val=l1.get(2);
l1.set(2,val + " changed");

System.out.println("l1 after change "+l1);

}
}
