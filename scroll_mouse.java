package com.company;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class scroll_mouse  extends Applet implements AdjustmentListener, MouseMotionListener {
    String msg=" ";
    Scrollbar vs,hs;
    Font y;

    public void init(){
        y=new Font("times new roman",Font.BOLD,25);
        setFont(y);
        vs=new Scrollbar(Scrollbar.VERTICAL,0,1,0,500);
        hs=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,500);

        vs.setBounds(480,10,20,480);
        hs.setBounds(10,480,470,20);

        add(vs); add(hs);

        setLayout(null);
        setSize(500,500);

        vs.addAdjustmentListener(this);
        vs.addAdjustmentListener(this);
        addMouseMotionListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    { repaint(); }

    public void mouseDragged(MouseEvent me)
    {
        int x=me.getX();
        int y=me.getY();
        vs.setValue(y);
        hs.setValue(x);
        repaint();
    }

    public void mouseMoved(MouseEvent me)
    {  }

    public void paint(Graphics g){
        msg="Vertical : "+vs.getValue();
        msg+="Horizonatal: "+hs.getValue();
        g.drawString(msg,6,160);

        g.drawString("*",hs.getValue(),vs.getValue());
    }
}


