import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class price{
    static int sum = 0;
    static void add(int price){
        sum+=price;
    }
}
class bill extends JFrame implements ActionListener{
    JButton s = new JButton("Submit");
    JTextField t = new JTextField();
    bill(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        t.setPreferredSize(new Dimension(200, 50));
        p.add(t);
        s.addActionListener(this);

        JRadioButton r1 = new JRadioButton("Cheese Pizza");
        JRadioButton r2 = new JRadioButton("Cheese crust pizza");
        JRadioButton r3 = new JRadioButton("No cheese pizza");

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        r1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                price.add(120);
                t.setText(t.getText().concat(" Cheese Pizza(120)"));
            }
        });
        r2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                price.add(150);
                t.setText(t.getText().concat(" Cheese Crust Pizza(150)"));
            }
        });
        r2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                price.add(150);
                t.setText(t.getText().concat(" No Cheese Pizza(150)"));
            }
        });
        r3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                price.add(100);
            }
        });

        p.add(r1);
        p.add(r2);
        p.add(r3);

        JCheckBox c1 = new JCheckBox("Olives");
        JCheckBox c2 = new JCheckBox("Pepproni");
        JCheckBox c3 = new JCheckBox("Panner");
        JCheckBox c4 = new JCheckBox("Veggies");

        c1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    price.add(30);
                    t.setText(t.getText().concat(" olives(30)"));
                }
            }
        });
        c2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    price.add(20);
                    t.setText(t.getText().concat(" pepproni(20)"));
                }
            }
        });
        c3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    price.add(40);
                    t.setText(t.getText().concat(" Panner(40)"));
                }
            }
        });
        c4.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    price.add(20);
                    t.setText(t.getText().concat(" Veggies(20)"));
                }
            }
        });

        p.add(c1);
        p.add(c2);
        p.add(c3);
        p.add(c4);
        p.add(s);

        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
       if(e.getSource() == s){
            t.setText(""+Integer.toString(price.sum));
            System.out.println(price.sum);
       }
    }
}
public class pizza{
    public static void main(String args[]){
        bill obj = new bill();
    }
}