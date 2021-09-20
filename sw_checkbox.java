package com.company;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sw_checkbox extends JApplet implements ItemListener {
    JTextField jf =new JTextField(15);
    public void init(){
        Container c1=getContentPane();
        c1.setLayout(new FlowLayout());

        JCheckBox cb = new JCheckBox("gmail");
        cb.addItemListener(this);
        c1.add(cb);

        cb=new JCheckBox("yahhoh");
        cb.addItemListener(this);
        c1.add(cb);

        cb=new JCheckBox("MSN mail");
        cb.addItemListener(this);
        c1.add(cb);

        cb=new JCheckBox(" email");
        cb.addItemListener(this);
        c1.add(cb);

        c1.add(jf);
    }
    public void itemStateChanged(ItemEvent ae){
        JCheckBox cb=(JCheckBox)ae.getItem();
        jf.setText(cb.getText());
    }
}


