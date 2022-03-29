import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Database
{
public static void main(String args[])
{
final JFrame f=new JFrame("project");
final JFrame f1=new JFrame("new window");
JLabel l1=new JLabel("This is my project FOR TAKING INFORMATION ABOUT EMPLOYER");
JButton B=new JButton("SUMBIT");
JButton B1=new JButton("NEXT ->");
final JButton B2=new JButton("<- PREVIOUS");
final JTextField T1=new JTextField();
final JTextField T2=new JTextField();
final JTextField T3=new JTextField();
final JTextField T4=new JTextField();
final JTextField T5=new JTextField();
f.setVisible(true);
f.setSize(600,800);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1.setBounds(20,20,200,50);
Container c=f.getContentPane();
c.setBackground(Color.GRAY);

JLabel L2=new JLabel("NAME");
L2.setBounds(25,60,50,50);
T1.setBounds(130,70,180,30);

JLabel L3=new JLabel("EMP ID");
L3.setBounds(25,100,50,50);
T2.setBounds(130,110,180,30);

JLabel L4=new JLabel("AGE");
L4.setBounds(25,140,50,50);
T3.setBounds(130,150,180,30);


JLabel L5=new JLabel("SALARY");
L5.setBounds(25,180,50,50);
T4.setBounds(130,190,180,30);

JLabel L6=new JLabel("DESIGNATION");
L6.setBounds(25,220,100,50);
T5.setBounds(130,230,180,30);

B.setBounds(200,310,120,60);
B1.setBounds(500,400,100,40);

f.add(l1);
f.add(L2);
f.add(L3);
f.add(L4);
f.add(L5);
f.add(L6);
f.add(T1);
f.add(T2);
f.add(T3);
f.add(T4);
f.add(T5);
f.add(B);
f.add(B1);
f1.add(B2);

B1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f.dispose();
f1.setVisible(true);
f1.setSize(650,750);
f1.setLayout(null);
B2.setBounds(100,400,150,40);
f1.add(B2);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=f1.getContentPane();
c.setBackground(Color.BLUE);
}});
B2.addActionListener(new ActionListener()
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

 