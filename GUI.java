  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI
{
public static void main(String args[])
{
final JFrame f=new JFrame("project");
final JFrame f1=new JFrame("new window");
JLabel l=new JLabel("calculater");
JButton B=new JButton("+");
JButton B1=new JButton("-");
JButton B2=new JButton("*");
JButton B3=new JButton("/");
JButton B4=new JButton("%");
JButton B5=new JButton("NEXT ->");
final JButton B6=new JButton("<- PREVIOUS");
final JTextField T1=new JTextField();
final JTextField T2=new JTextField();
final JTextField T3=new JTextField();
final JTextField T4=new JTextField();
f.setVisible(true);
f.setSize(650,750);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l.setBounds(20,20,200,50);
Container c=f.getContentPane();
c.setBackground(Color.ORANGE);

JLabel N=new JLabel("num1");
N.setBounds(25,60,50,50);
T1.setBounds(100,70,70,30);

JLabel N2=new JLabel("num2");
N2.setBounds(25,100,50,50);
T2.setBounds(100,110,70,30);

JLabel N3=new JLabel("ans");
N3.setBounds(25,150,70,30);
T3.setBounds(100,160,70,30);

JLabel N4=new JLabel("Name");
N4.setBounds(25,150,70,30);
T4.setBounds(100,160,70,30);


B.setBounds(30,260,70,40);
B1.setBounds(100,260,70,40);
B2.setBounds(170,260,70,40);
B3.setBounds(240,260,70,40);
B4.setBounds(140,300,70,40);
B5.setBounds(500,400,100,40);



f.add(l);
f.add(T1);
f.add(T2);
f.add(T3);
f.add(N);
f.add(N2);
f.add(N3);
f.add( B);
f.add(B1);
f.add(B2);
f.add(B3);
f.add(B4);
f.add(B5);
f1.add(B6);
f1.add(N3);
f1.add(T4);
 
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

B1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(T1.getText());
b=Integer.parseInt(T2.getText());
c=a-b;
System.out.println(c);
T3.setText(String.valueOf(c));
}});

B2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(T1.getText());
b=Integer.parseInt(T2.getText());
c=a*b;
System.out.println(c);
T3.setText(String.valueOf(c));
}});

B3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(T1.getText());
b=Integer.parseInt(T2.getText());
c=a/b;
System.out.println(c);
T3.setText(String.valueOf(c));
}});

B4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(T1.getText());
b=Integer.parseInt(T2.getText());
c=a%b;
System.out.println(c);
T3.setText(String.valueOf(c));
}});

B5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f.dispose();
f1.setVisible(true);
f1.setSize(650,750);
f1.setLayout(null);
B6.setBounds(100,400,150,40);
f1.add(B6);
f1.add(T4);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=f1.getContentPane();
c.setBackground(Color.GREEN);
}});
B6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f1.dispose();
f.setVisible(true);
f.setSize(650,750);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}});
}
}








