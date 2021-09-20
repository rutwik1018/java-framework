package com.company;

import java.awt.*;
import java.awt.event.*;
class menu_class extends Frame  implements ActionListener
{
    menu_class(String s){
        super(s);
        MenuBar mbar = new MenuBar();    //mbarr is object of menubar
        setMenuBar(mbar);

        Menu file = new Menu("file");     // file is a object of a menu
        MenuItem item1,item2,item3;

        file.add(item1 = new MenuItem("SAVE"));     // define the options
        file.add(item2 = new MenuItem("SaveAS"));
        file.add(item3 = new MenuItem("CANCLE"));
        mbar.add(file);                                     // options addoing the menu bar
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

        addWindowFocusListener(new WindowAdapter()            //this foe working the exit button x
        {   public void windowClosing(WindowEvent ae){
            System.exit(0);
        }
         });

                             }

    public void actionPerformed(ActionEvent ae){

        String s=ae.getActionCommand();
        if(s.equals("SAVE"))
            setBackground(Color.gray);
        else if(s.equals("SaveAs"))
            setBackground(Color.pink);
        else if(s.equals("CANCLE"))
            setBackground(Color.yellow);
    }
}





public class menu_bar {
    public static void main(String[] args) {
         menu_class f =new menu_class("creating menu button");
        f.setSize(500,500);
        f.show();

    }
}
