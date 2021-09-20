package com.company;
import java.awt.*;
 class zframe_5 extends Frame{
     //creating a group of check box for choose only one option
     CheckboxGroup cg = new CheckboxGroup();
     Checkbox r1 =new Checkbox("10th",cg,false);
     Checkbox r2 =new Checkbox("12th",cg,false);
     Checkbox r3 =new Checkbox("diploma",cg,false);
     Checkbox r4 =new Checkbox("degree",cg,false);
     Checkbox r5 =new Checkbox("other",cg,false);
     // craeting a label
     Label l1 = new Label("what is your education ?");
     //constructor
      zframe_5(String s){
          super(s);
          setLayout(new GridLayout(7,1));
          add(l1);  //call label
          add(r1);
          add(r2);
          add(r3);
          add(r4);
          add(r5);
      }

     public static void main(String[] args) {
         zframe_5 f1 = new zframe_5("framework checkbox choose only one ");
         f1.setSize(900,800);
        // f1.setVisible(true);
         f1.show();
     }
}
