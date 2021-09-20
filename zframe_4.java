package com.company;
import java.awt.*;
 class zframe_4 extends Frame {
     Checkbox c1 = new Checkbox("virat");
     Checkbox c2 = new Checkbox("dhoni",true);   // always tick innthis box
     Checkbox c3 = new Checkbox("rohit");
     Checkbox c4 = new Checkbox("k l rahul");
     Checkbox c5 = new Checkbox("sachin");
     Label l1 = new Label("who is your favourite cricketer;");

     zframe_4( String s){
        super(s);
        setLayout(new GridLayout(6,1)); // arrage in the one colume and 6 row
        add(l1);
        add(c1);
        add(c2);
         add(c3);
         add(c4);
         add(c5);
     }

     public static void main(String[] args) {
         zframe_4 f1 = new zframe_4("framework cheackboxes");
         f1.setSize(900,700);
         f1.setVisible(true);
     }
}
