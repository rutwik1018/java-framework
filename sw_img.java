package com.company;
import java.awt.*;
import javax.swing.*;

class img extends JFrame
{
    img(){
        Container c1=getContentPane();
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("C:\\tt1.jpg");  //IMAGE MUST  IN C DISK

        JLabel l1 = new JLabel("tejas adhalrao",i1,JLabel.CENTER);

        l1.setVerticalTextPosition(JLabel.TOP);
        l1.setHorizontalTextPosition(JLabel.CENTER);

        c1.add(l1);

    }

}

public class sw_img {
    public static void main(String[] args) {
        img f=new img();
        f.show();
    }
}
