package com.company;
// creating a buttons in frame
import java.awt.*;
 class zframe_3 extends Frame {
   Button  b1 =new Button(" tejas ");   //defines button--> tejas
   Button b2 = new Button(" rutik ");   //
   Button b3 = new Button("adhalrao");
   Button b4 = new Button("patil");
     zframe_3(String s){     // accept a name of frame
         super(s);
         setLayout(new FlowLayout());             //locations of buttons
         add(b1);
         add(b2);
         add(b3);
         add(b4);
           }

     public static void main(String[] args) {
         zframe_3 f1 = new zframe_3("framewok of buttonsssssss");
         f1.setSize(500,500);
         f1.setVisible(true);
     }
}
