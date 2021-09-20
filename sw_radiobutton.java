package com.company;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sw_radiobutton  extends JApplet implements ActionListener  {

    Container c1;
    public void init(){
        c1=getContentPane();
        c1.setLayout(new FlowLayout());
        JRadioButton bt1= new JRadioButton("RED");
        JRadioButton bt2= new JRadioButton("BLUE");
        JRadioButton bt3= new JRadioButton("GREEN");
        c1.add(bt1); c1.add(bt2); c1.add(bt3);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("RED"))
            c1.setBackground(Color.red);
        if(s.equals("BLUE"))
            c1.setBackground(Color.blue);
        if(s.equals("GREEN"))
            c1.setBackground(Color.green);
    }
}

