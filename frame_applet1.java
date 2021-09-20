package com.company;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class frame_applet1 extends Applet implements ItemListener
{
    Choice c1,c2;
    String msg;
    public void init(){
        c1=new Choice();
        c2=new Choice();

        c1.add("virat"); c1.add("dhoni"); c1.add("rahul"); c1.add("dhawan");
        add(c1);

        c2.add("cricket"); c2.add("football"); c2.add("teniss"); c2.add("chess");
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
         }

         public void paint(Graphics g){
        msg="your fav cricketer -> "+ c1.getSelectedItem();
        g.drawString(msg,5,100);

        msg="your favourite game -> "+ c2.getSelectedItem();
        g.drawString(msg,5,130);
         }

         public void itemStateChanged(ItemEvent ie){
        repaint();
         }

}
