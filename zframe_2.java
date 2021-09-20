package com.company;
/// creating a multiple frame in one program
// creating a multiple  object and passese the frame name
//set different size of frame
import java.awt.*;
 class zframe_2 extends Frame {
     zframe_2(String s){
         super(s);
     }

     public static void main(String[] args) {
         zframe_2 f1 = new zframe_2(" first frame");
         f1.setSize(500,500);
         f1.setVisible(true);
         zframe_2 f2 = new zframe_2("  seconf frame");
         f2.setSize(800,800);
         f2.setVisible(true);
         zframe_2 f3 = new zframe_2(" third frame");
         f3.setSize(1000,900);
         f3.setVisible(false);

     }
}
