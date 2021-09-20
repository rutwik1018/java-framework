package com.company;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class frame_applet  extends Applet implements ActionListener{

    String msg=" click on the button";
    Button b1,b2,b3;
    public void init(){
        Button b1=new Button("exit");
        Button b2 = new Button("back");
        Button b3= new Button("close");
        add(b1); add(b2); add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(msg,5,50);
    }

    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("exit"))
            msg="you pressed exit button";
       else if(s.equals("back"))
            msg="you pressed backk button";
        else if(s.equals("close"))
            msg="you pressed close button";
        repaint();
    }
}
