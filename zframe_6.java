package com.company;
import java.awt.*;
public class zframe_6  extends Frame  {
    Choice c1 = new Choice();
    Label l1 = new Label("choose gender---->");

    zframe_6 (String s){
        setLayout(new FlowLayout());
        c1.add("maleeee");
       c1.add("femaleee");
       c1.add("otheree");

       add(l1);
       add(c1);
    }


    public static void main(String[] args) {
        zframe_6 ff = new zframe_6("framework of choose a option ");
        ff.setSize(700,700);
        ff.setVisible(true);

    }


}
