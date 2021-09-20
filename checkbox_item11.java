package com.company;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class checkbox_item11 extends Applet implements ItemListener
        {
        String msg=" ";
        Checkbox c1,c2,c3,c4;
        CheckboxGroup cbg;

public void init()
        {
        cbg=new CheckboxGroup();
        c1=new Checkbox("idea cellular",cbg,true);
        c2=new Checkbox("airtel",cbg,true);
        c3=new Checkbox("jio",cbg,true);
        c4=new Checkbox("vivivi",cbg,true);
        add(c1); add(c2); add(c3); add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        }
public void itemStateChanged(ItemEvent ae)
        {
        repaint();;
        }

public void paint(Graphics g)
        {
        msg="current selected checkbox --> ";
        msg+=cbg.getSelectedCheckbox().getLabel();

        g.drawString(msg,10,100);
        }

        }


