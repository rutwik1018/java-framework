package com.company;
import java.awt.*;
import java.awt.event.*;

class pannel extends Panel{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    pannel(){
        b1 = new Button("red");
        b2= new Button("green");
        b3= new Button("blue");
        b4= new Button("pink");
        b5= new Button("yellow");
        b6= new Button("cyan");
        b7= new Button("orange");
        b8= new Button("black");
        b9= new Button("gray");
        setLayout(new GridLayout(9,1));
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
    }
}

class color extends Frame implements ActionListener {

    color(String s) {
        super(s);
        pannel p = new pannel();
        add(p, "East");
        Button bt1 = new Button("Exit");
        add(bt1, "South");
        bt1.addActionListener(this);
        p.b1.addActionListener(this);
        p.b2.addActionListener(this);
        p.b3.addActionListener(this);
        p.b4.addActionListener(this);
        p.b5.addActionListener(this);
        p.b6.addActionListener(this);
        p.b7.addActionListener(this);
        p.b8.addActionListener(this);
        p.b9.addActionListener(this);
        setSize(500, 500);
        setVisible(true);
        setBackground(Color.WHITE);

    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("red"))
            setBackground(Color.red);
        else if (s.equals("green"))
            setBackground(Color.green);
        else if (s.equals("blue"))
            setBackground(Color.blue);
        else if (s.equals("pink"))
            setBackground(Color.pink);
        else if (s.equals("yellow"))
            setBackground(Color.yellow);
        else if (s.equals("cyan"))
            setBackground(Color.cyan);
        else if (s.equals("orange"))
            setBackground(Color.orange);
        else if (s.equals("black"))
            setBackground(Color.black);
        else if (s.equals("gray"))
            setBackground(Color.gray);
        else if (s.equals("Exit"))
             System.exit(0);

    }
}


public class  colorbutt {
    public static void main(String[] args) {
color f1 = new color("play with color");
    }
}
