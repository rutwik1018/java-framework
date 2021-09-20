package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sw_combo extends JApplet implements ItemListener {
    JLabel l1;
    public void init(){
        Container c1=getContentPane();
        c1.setLayout(new FlowLayout());


        JComboBox jc = new JComboBox();
        jc.addItem("19");
        jc.addItem("20");
        jc.addItem("21");
        jc.addItem("22");
        jc.addItemListener(this);

        l1=new JLabel("Select your age");
        c1.add(l1);
        c1.add(jc);


    }
    public void itemStateChanged(ItemEvent ae){
        String s=(String)ae.getItem();
        l1.setText(s);
    }
}






