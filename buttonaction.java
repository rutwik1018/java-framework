package com.company;
import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ActionListener {
    Button b1,b2,b3;
    Label lb1;

    myframe(String s){
        super(s);

        setLayout(new FlowLayout());
        b1= new Button("hi");
        b2= new Button("Good morning");
        b3= new Button("Good night");
        add(b1); add(b2); add(b3);
        lb1 = new Label("messeges for u click the button");
        add(lb1);
        b1.addActionListener (this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(900,700);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae)
    {String s=ae.getActionCommand();
        if(s.equals("hi"))
            lb1.setText("hellow .... how are you ");
        else if(s.equals("Good morning"))
            lb1.setText("good morning..have a nice day");
        else if(s.equals("Good night"))
            lb1.setText("good night, sweet dream");

    }
}



class buttonsaction{
    public static void main(String[] args) {
        myframe f1 = new myframe("buttons actionn framework");
    }
}
