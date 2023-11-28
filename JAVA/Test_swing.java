import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Test_swing extends JFrame
{
  public Test_swing()
  {
    JCheckBox jcb = new JCheckBox("yes");   //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    jcb = new JCheckBox("no");              //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    jcb = new JCheckBox("maybe");           //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
  }
  public static void main(String[] args)
  {
    new Test_swing();
  }
}