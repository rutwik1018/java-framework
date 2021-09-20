package com.company;
import java.awt.*;
public class zframe_8 extends Frame {
    TextField t1 = new TextField(20);
    Label lb1 = new Label("name->");

    TextArea t2 = new TextArea(20,50);
    Label lb2 = new Label("feedback->");
           zframe_8(){
        super("crating area in framework");
        setLayout(new FlowLayout());
        add(lb1);
        add(t1);

        add(lb2);
        add(t2);
          }


    public static void main(String[] args) {
        zframe_8 f1 = new zframe_8();
        f1.setSize(900,900);
               f1.show();
    }

}
