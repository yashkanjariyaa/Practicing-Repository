import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;
class calculatorNew extends JFrame implements ActionListener 
{
double a=0,b=0,result=0;
JTextField t;
JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
int operator=0;
calculatorNew()
{
b0 = new JButton("0");
b1 = new JButton("1");
b2 = new JButton("2");
b3 = new JButton("3");
b4 = new JButton("4");
b5 = new JButton("5");
b6 = new JButton("6");
b7 = new JButton("7");
b8 = new JButton("8");
b9 = new JButton("9");
// create operator buttons
beq1 = new JButton("=");
ba = new JButton("+");
bs = new JButton("-");
bd = new JButton("/");
bm = new JButton("*");
beq = new JButton("C");
be = new JButton(".");
t=new JTextField(20);
t.setSize(10,10);
JPanel p = new JPanel();
bm.addActionListener(this);
bd.addActionListener(this);
bs.addActionListener(this);
ba.addActionListener(this);
b9.addActionListener(this);
b8.addActionListener(this);
b7.addActionListener(this);
b6.addActionListener(this);
b5.addActionListener(this);
b4.addActionListener(this);
b3.addActionListener(this);
b2.addActionListener(this);
b1.addActionListener(this);
b0.addActionListener(this);
be.addActionListener(this);
beq.addActionListener(this);
beq1.addActionListener(this);
p.add(t);
p.add(ba);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(bs);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(bm);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(bd);
p.add(be);
p.add(b0);
p.add(beq);
p.add(beq1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.setBackground(Color.pink);
// add panel to frame
add(p);
setSize(235, 235);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==be)
t.setText(t.getText().concat("."));
if(e.getSource()==ba)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}
if(e.getSource()==bs)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bm)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bd)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq1)
{
b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==beq)
t.setText("");
}
public static void main(String args[])
{
calculatorNew cal=new calculatorNew();
}
}
