package com.company;
import java.awt.*;
import java.awt.event.*;
class mywindow extends Frame implements WindowListener, ActionListener{
    mywindow(){
        super("multiple command of window listener");
        addWindowListener(this);
        Button b1 = new Button("EXIT");
        b1.setBounds(100,100,50,20);
        add(b1);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        b1.addActionListener(this);
    }



    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if (s.equals("EXIT"))
            System.exit(0);
    }

    public void windowActivated(WindowEvent w1){
        System.out.println("active window.....");
        setBackground(Color.red);
    }

    public void windowDeactivated(WindowEvent w1){
     System.out.println("deactived");
     setBackground(Color.green);
    }

    public void windowIconified(WindowEvent w1){
        System.out.println("iconified ico");
        setBackground(Color.blue);
    }

    public void windowOpened(WindowEvent w1){
        System.out.println("iconified open");
        setBackground(Color.green);
    }
    public void windowClosed(WindowEvent w1){ }

    public void windowDeiconified(WindowEvent w1){
        System.out.println(" Deiconified ......");
        setBackground(Color.yellow);
    }

    public void windowClosing(WindowEvent w1){
        System.exit(0);
    }

}


public class window_col {
    public static void main(String[] args) {
        new mywindow();
    }
}
