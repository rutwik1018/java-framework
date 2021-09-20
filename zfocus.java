package com.company;



import java.awt.*;
import java.awt.event.*;
class focus extends Frame implements FocusListener
{
    TextField t1,t2,t3;
    focus(){
        super("focus window");
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        add(t1); add(t2); add(t3);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,500);

        t2.addFocusListener(this);
        t1.addFocusListener(this);
        t3.addFocusListener(this);
    }


    public void focusGained(FocusEvent fe){
        if(fe.getSource()==t2)
            t2.setBackground(Color.yellow);
        if(fe.getSource()==t1)
            t1.setBackground(Color.yellow);
        if(fe.getSource()==t3)
            t3.setBackground(Color.yellow);
    }

    public void focusLost(FocusEvent fe){
        if(fe.getSource()==t2)
            t2.setBackground(Color.red);
        if(fe.getSource()==t1)
            t1.setBackground(Color.red);
        if(fe.getSource()==t3)
            t3.setBackground(Color.red);
    }

}
public class zfocus{
    public static void main(String args[]){
        new focus();
    }
}
