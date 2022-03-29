import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Frame
{
public static void main(String args[])
{
JFrame f=new JFrame("project");
JLabel l=new JLabel("This is my project TO ADD TWO NO.");
JButton B=new JButton("click");
final JTextField T1=new JTextField();
final JTextField T2=new JTextField();
final JTextField T3=new JTextField();
f.setVisible(true);
f.setSize(400,500);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l.setBounds(20,20,200,50);

JLabel N=new JLabel("num1");
N.setBounds(25,60,50,50);
T1.setBounds(100,70,70,30);

JLabel Q=new JLabel("num2");
Q.setBounds(25,100,50,50);
T2.setBounds(100,110,70,30);


JLabel V=new JLabel("ans");
V.setBounds(25,150,70,30);
T3.setBounds(100,160,70,30);

JLabel P=new JLabel("add num1+num2");
P.setBounds(50,260,200,30);

B.setBounds(200,260,100,40);

f.add(l);
f.add(B);
f.add(T1);
f.add(N);
f.add(Q);
f.add(T2);
f.add(P);
 f.add(V);
f.add(T3);
B.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(T1.getText());
b=Integer.parseInt(T2.getText());
c=a+b;
System.out.println(c);
T3.setText(String.valueOf(c));
}});
}
}