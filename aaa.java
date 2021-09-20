package com.company;
 import java.awt.*;
 import java.awt.event.*;

 class dayss extends Frame implements ActionListener{
     TextField fi, fy, fm, fw;
     Label li, ly, lm, lw;
     Button b1, b2, b3;

     dayss() {
         super("days coversion");
         li = new Label("Enter days: ");
         li.setBounds(100, 70, 70, 20);
         ly = new Label("1->YEARS: ");
         ly.setBounds(100, 120, 70, 20);
         lm = new Label("2->MONTHS: ");
         lm.setBounds(100, 160, 70, 20);
         lw = new Label("3->WEEKS: ");
         lw.setBounds(100, 200, 70, 20);
         add(li);
         add(ly);
         add(lm);
         add(lw);

         fi = new TextField(20);
         fi.setBounds(180, 70, 70, 20);
         fy = new TextField(20);
         fy.setBounds(180, 120, 70, 20);
         fm = new TextField(20);
         fm.setBounds(180, 160, 70, 20);
         fw = new TextField(20);
         fw.setBounds(180, 200, 70, 20);
         add(fi);
         add(fy);
         add(fm);
         add(fw);

         b1 = new Button("CONVERT");
         b1.setBounds(200, 240, 70, 20);
         b2 = new Button("CLEAR");
         b2.setBounds(290, 240, 70, 20);
         b3 = new Button("EXIT");
         b3.setBounds(370, 240, 70, 20);
         add(b1);
         add(b2);
         add(b3);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);


         setLayout(null);
         setSize(500, 500);
         setVisible(true);
         setBackground(Color.gray);


     }

     public void actionPerformed(ActionEvent ae) {
         String si = ae.getActionCommand();
         if (si.equals("EXIT")) {
             System.exit(0);
         }
         try {
             String sd = fi.getText();
             int a = Integer.parseInt(sd);
             int years, months, weeks;
             years = a/365;
             months = a/30;
             weeks = a/7;
             if (si.equals("CONVERT")) {
                 fy.setText(String.valueOf(+years));
                 fm.setText(String.valueOf(+months));
                 fw.setText(String.valueOf(+weeks));
             } else if (si.equals("CLEAR")) {
                 fy.setText(" ");
                 fm.setText(" ");
                 fw.setText(" ");
             }


         } catch (Exception e) {
             System.out.println("your inpute error...!" + e);
         }

     }
 }

public class aaa{
    public static void main(String[] args) {
         new dayss();

    }
}

/*public void actionPerformed(ActionEvent ae) {
         String si = ae.getActionCommand();
      if (si.equals("EXIT")) {
             System.exit(0);
         }
         try {
             String sd = fi.getText();
             int a = Integer.parseInt(sd);
             int years, months, weeks;
             years = a / 365;
             months = a / 30;
             weeks = a / 7;
             if (si.equals("CONVERT")) {
                 fy.setText(String.valueOf(years));
                 fm.setText(String.valueOf(months));
                 fw.setText(String.valueOf(weeks));
             } else if (si.equals("CLEAR")) {
                 fy.setText(" ");
                 fm.setText(" ");
                 fw.setText(" ");
             }


         }
         catch(Exception e){
             System.out.println("your inpute error...!"+e);
         }

         */
