import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calc extends JFrame implements ActionListener {
    JtextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bm, bd, be, bc, bp;
    calc(){
        //numbers buttons
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        //operators buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        b2 = new JButton("=");
        bc = new JButton("C");
        bp = new JButton(".");
        //text field
        t = new JtextField(20);
        JPanel p = new JPanel();
        //adding event listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);
        bp.addActionListener(this);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(ba);
        p.add(bs);
        p.add(bm);
        p.add(bd);
        p.add(be);
        p.add(bc);
        p.add(bp);
        p.add(t);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding panel to frame

        add(p);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getSource){
            case b1 : t.setText(t.getText().concat("1"));
            break;
            case b2 : t.setText(t.getText().concat("2"));
            break;
            case b3 : t.setText(t.getText().concat("3"));
            break;
            case b4 : t.setText(t.getText().concat("4"));
            break;
            case b5 : t.setText(t.getText().concat("5"));
            break;
            case b6 : t.setText(t.getText().concat("6"));
            break;
            case b7 : t.setText(t.getText().concat("7"));
            break;
            case b8 : t.setText(t.getText().concat("8"));
            break;
            case b9 : t.setText(t.getText().concat("9"));
            break;
            case b0 : t.setText(t.getText().concat("0"));
        }
    }
}
