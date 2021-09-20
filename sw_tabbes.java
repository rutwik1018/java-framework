package com.company;

//public class sw_tabbes {


import java.awt.*;
import javax.swing.*;

public class sw_tabbes extends JApplet
{
    public void init()
    {
        Container c1=getContentPane();
        JTabbedPane jt=new JTabbedPane();
        jt.addTab("news papers",new npaper());
        jt.addTab("books",new book() );
        jt.addTab("maa",new maa());
        c1.add(jt);
    }
}

class npaper extends JPanel{
    public npaper(){
        JButton b1= new JButton("indian Express");
        JButton b2= new JButton("lokamt");
        JButton b3= new JButton("sakal");
        JButton b4= new JButton("pudhari");
        add(b1); add(b2); add(b3); add(b4);
    }
    //here we add actionPerformed class and give action to the button
}

class book extends JPanel{
    public book(){
        JCheckBox  jb1  =new JCheckBox("bhagvaatgita");
        JCheckBox  jb2  =new JCheckBox("ramayaan");
        JCheckBox  jb3  =new JCheckBox("mahabharat");
        add(jb1); add(jb2); add(jb3);
    }
}

class maa extends JPanel{
    public maa() {

        JComboBox jcb= new JComboBox();
        jcb.addItem("google");
        jcb.addItem("yaaho");
        jcb.addItem("googleeee");
        jcb.addItem("goggggg");
        add(jcb);
    }
}



