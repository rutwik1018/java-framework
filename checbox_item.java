package com.company;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public  class checbox_item extends Applet implements ItemListener    {
    String msg=" ";
    Checkbox c1,c2,c3,c4;
    public void init(){
        c1= new Checkbox("pune",true);
        c2=new Checkbox("mumbai");
        c3=new Checkbox("nashik");
        c4=new Checkbox("nagpur");

        add(c1); add(c2); add(c3); add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ae){
        repaint();
    }

    public void paint(Graphics g)
    {
        msg="are u froam ?";
        g.drawString(msg,6,100);

        msg=" punekar --> "+c1.getState();
        g.drawString(msg,6,120);

        msg=" mumbaikar --> "+c2.getState();
        g.drawString(msg,6,140);

        msg=" nashikar --> "+c3.getState();
        g.drawString(msg,6,160);

        msg=" nagpurkar --> "+c4.getState();
        g.drawString(msg,6,180);
    }
}