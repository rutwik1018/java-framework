package com.company;


        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
public class sw_button extends JFrame implements ActionListener {
    JButton b1=new JButton("yellow");
    JButton b2=new JButton("pink");
    JButton b3=new JButton("red");
    Container c1;
    public sw_button(){
        c1=getContentPane();
        c1.add(b1);
        b1.setMnemonic(KeyEvent.VK_Y);
        b1.setToolTipText("yeloow button");

        c1.add(b2);
        b2.setMnemonic(KeyEvent.VK_P);
        b2.setToolTipText("pink button");

        c1.add(b3);
        b3.setMnemonic(KeyEvent.VK_R);
        b3.setToolTipText("red button");
        setLayout(new FlowLayout());
        setSize(500,500);
        show();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();

        if(source==b1)
            c1.setBackground(Color.yellow);
        else if(source==b2)
            c1.setBackground(Color.pink);
        else if(source==b3)
            c1.setBackground(Color.red);
    }

    public static void main(String args[]){

        sw_button a =new sw_button();
        //a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
