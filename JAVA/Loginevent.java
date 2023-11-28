import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class Loginevent extends JFrame implements ActionListener 
{ 
JFrame jf; 
JLabel l1,l2; 
JTextField tf1, ot; 
JPasswordField tf2; 
JButton b1,b2; 
Loginevent() 
{ 
//create componant
jf= new JFrame("Login Test"); 
tf1=new JTextField(10); 
l1=new JLabel("Username"); 
ot=new JTextField(20); 
l2=new JLabel("Passward"); 
tf2 = new JPasswordField(10); 
b1=new JButton("OK"); 
b2=new JButton("Reset"); 
//set Layout
jf.setLayout(new FlowLayout()); 
//add component on frame/window
jf.add(l1); 
jf.add(tf1); 
jf.add(l2); 
jf.add(tf2); 
jf.add(b1); 
jf.add(b2); 
jf.add(ot);
//register component which are causing events
b1.addActionListener(this); 
b2.addActionListener(this); 
jf.setSize(500,100); 
jf.setVisible(true); 
} 
public void actionPerformed(ActionEvent e) 
{ 
if(e.getSource()==b1) 
{ 
String s1=tf1.getText(); 
String s2 = String.valueOf(tf2.getPassword()); 
ot.setText("UserName="+s1+" Passward="+s2);
} 
else if(e.getSource()==b2) 
{ 
tf1.setText(""); 
tf2.setText(""); 
ot.setText("");
} 
} 
public static void main(String args[]) 
{ 
Loginevent x = new Loginevent(); 
} 
}
