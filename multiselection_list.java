package com.company;


import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class multiselection_list extends Applet implements ActionListener
{
    List cellphone,companies;
    String msg=" ";
    public void init(){
        cellphone =  new List(4,true);
        companies =  new List(4,false);

        cellphone.add("MI");
        cellphone.add("SAMSUNG");
        cellphone.add("one +");
        cellphone.add("i-phone");
        cellphone.add("NOKIA");

        companies.add("TATA");
        companies.add("JIO");
        companies.add("RELIANCE");
        companies.add("C-IAT");
        companies.add("MRF");
        companies.add("all companies inn in india.....india india india ");

        add(cellphone);
        add(companies);

        cellphone.addActionListener(this);
        companies.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        repaint();
    }

    public void paint(Graphics g){
        String s[];
        msg="current phone-->";
        s=cellphone.getSelectedItems();
        for(int i=0;i<s.length;i++) {
            msg += s[i] + " ";
        }
        g.drawString(msg,10,100);

        msg="current comapnnies-->";
        String str=companies.getSelectedItem();
        g.drawString(msg+str,10,120);

    }

}
