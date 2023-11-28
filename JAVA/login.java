import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
    JFrame jf;
    JLabel tl, pl;
    JTextField t1, vt;
    JPasswordField p;
    JButton b, r;
    login()
    {
        jf = new JFrame("Login");
        tl = new JLabel("Username");
        pl = new JLabel("Password");
        t1 = new JTextField(10);
        vt = new JTextField(30);
        p = new JPasswordField(20);
        b = new JButton("Ok");
        r = new JButton("Reset");

        jf.setLayout(new FlowLayout());
        jf.setSize(400, 200);
        jf.setVisible(true);

        jf.add(tl);
        jf.add(t1);
        jf.add(pl);
        jf.add(p);
        jf.add(vt);
        jf.add(b);
        jf.add(r);

        b.addActionListener(this);
        r.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b){
        String s1 = t1.getText();
        String s2 = String.valueOf(p.getPassword());
        vt.setText("Username = " + s1 + " Password = " + s2);
       } else if ( e.getSource() == r){
        t1.setText("");
        vt.setText("");
        p.setText("");
       }
    }
    public static void main(String args[])
    {
        login obj = new login();
    }
}





















