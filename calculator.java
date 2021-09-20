package com.company;

import java.awt.*;
import java.awt.event.*;


class claculator extends Frame implements ActionListener  {
    Button b1,b2,b3,b4,b5,b6,b7;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    claculator(String s){
        super(s);
        b1=new Button("add");
        b2=new Button("sub");
        b3=new Button("mul");
        b4=new Button("div");
        b5=new Button("CANCLE");
        b6=new Button("EXIT");


        l1=new Label("number1:");
        l2=new Label("number2:");
        l3=new Label("answer:");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        add(l1);  l1.setBounds(100,100,50,20);
        add(l2);  l2.setBounds(100,140,50,20);
        add(l3);  l3.setBounds(100,180,50,20);

        add(t1);  t1.setBounds(170,100,50,20);
        add(t2);  t2.setBounds(170,140,50,20);
        add(t3);  t3.setBounds(170,180,50,20);



        Panel p1 =new Panel();
        p1.add(b1); p1.add(b2); p1.add(b3); p1.add(b4); p1.add(b5); p1.add(b6);
        add(p1);
        p1.setBounds(50,200,300,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);



        setLayout(null);
        setSize(500,500);
        setVisible(true); }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("EXIT")){
            System.exit(0);}

        try {
            String s1 = t1.getText();
            String s2 = t2.getText();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);


            if (s.equals("add"))
                t3.setText(String.valueOf(a+b));
            else if (s.equals("sub"))
                t3.setText(String.valueOf(a-b));
            else if (s.equals("mul"))
                t3.setText(String.valueOf(a*b));
            else if (s.equals("div"))
                t3.setText(String.valueOf(a/b));
            else if (s.equals("CANCLE")){
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" "); }


        }
        catch(Exception e){
            System.out.println("dividion by zero"+e);
        }
    }

}


public class calculator {
    public static void main(String[] args) {
        claculator c1 = new claculator("my first calculator");

    }
}
