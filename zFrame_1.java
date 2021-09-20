package com.company;
import java.awt.*;                                      //this is package needed

class zFrame_1 extends Frame{                           // extends class frame
   zFrame_1(){                                         // class constructor
       super("this is my first frame");           // by the use of super its passese throught frame class

       setSize(400,400);                  //size of frame
       setVisible(true);                              //******for showing frame itas neeeded
           }

    public static void main(String[] args) {
        zFrame_1 f1 = new zFrame_1();

    }
 }