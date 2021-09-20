package com.company;
import java.awt.*;
import java.awt.event.*;
class pan extends Frame implements ActionListener{
    Button b1,b2,b3;
    Label  l1,l2,l3;
    TextField t1,t2;
    pan(String st){
        super(st);
        l1=new Label("Login");
        l2=new Label("Password");
        l3=new Label("welcome to the login page");

        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("OK");
        b2=new Button("CANCLE");
        b3=new Button("EXIT");

        add(b1); b1.setBackground(Color.green);  b1.setBounds(150,300,70,20);
        add(b2); b2.setBackground(Color.green);  b2.setBounds(220,300,70,20);
        add(b3); b3.setBackground(Color.green);  b3.setBounds(290,300,70,20);

        add(l1); l1.setBounds(180,200,70,20);
        add(l2); l2.setBounds(180,240,70,20);
        add(l3); l3.setBounds(180,400,150,20); l3.setBackground(Color.yellow);

        add(t1); t1.setBounds(250,200,70,20);
        add(t2); t2.setBounds(250,240,70,20);

        setLayout(null);
        setSize(500,600);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        String s1=t1.getText();
        String s2=t2.getText();

        if(s.equals("CANCLE")){
            l3.setText("you click cancle");
            t1.setText(" ");   t2.setText(" ");}
        else if(s.equals("OK")){
            if(!(s1.equals("tejas")))
                l3.setText("your name wrong see in password");
            else if(!(s2.equals("tejas@123")))
                l3.setText("your password is wrong");
        }
         else if(s.equals("EXIT"))
             System.exit(0);


    }
}







 class zlogin_pass {
     public static void main(String[] args) {
         pan p1= new pan("login window framework");
         p1.setSize(500,500);
         p1.show();


     }
}
