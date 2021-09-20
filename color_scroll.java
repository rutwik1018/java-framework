package com.company;
import java.awt.*;
import java.awt.event.*;
 class  scroll extends Frame implements AdjustmentListener
{
    Scrollbar s1,s2,s3;
    Label l1,l2,l3;

     scroll(){
        l1=new Label("0");
        l2=new Label("0");
        l3=new Label("0");

        s1= new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);
        s2= new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);
        s3= new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);

        s1.setBounds(100,100,20,200);
        s2.setBounds(250,100,20,200);
        s3.setBounds(400,100,20,200);

        l1.setBounds(100,320,50,20);
        l2.setBounds(250,320,50,20);
        l3.setBounds(400,320,50,20);

        add(s1); add(s2); add(s3);
        add(l1);add(l2); add(l3);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setBackground(Color.white);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ae)
            { System.exit(0); }
        });

    }
    public void adjustmentValueChanged(AdjustmentEvent ae){
        int r,b,g;
        r=s1.getValue();
        l1.setText(r+"");

        g=s2.getValue();
        l2.setText(g+"");

        b=s3.getValue();
        l3.setText(b+"");

        Color c1 = new Color(r,g,b);
        setBackground(c1);
    }

}
public class color_scroll{
    public static void main(String[] args) {
        new scroll();
    }
}
