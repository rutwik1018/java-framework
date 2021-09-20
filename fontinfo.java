package com.company;

import java.applet.Applet;
import java.awt.*;

public class fontinfo  extends Applet {
    Font f;

    public void init() {
        f = new Font("times new roman", 3, 25);
        setFont(f);
    }
    public void paint(Graphics gg)
    {
        String fn=f.getName();
        String ff=f.getFamily();
        int fs=f.getSize();
        int fst=f.getStyle();
        String msg="1)familiy --> "+ff+ "-----2)font name-->"+fn+ "----3)font sizze--> "+fs+ "----5)font style--> "+fst;
        gg.drawString(msg,6,100);
    }

}
