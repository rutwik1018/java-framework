package com.company;

import java.awt.*;
import java.applet.*;

public class card_layout11 extends Applet {
    public void init()
    {
        setLayout(new BorderLayout());
        add(new Button("top"),BorderLayout.NORTH);
        add(new Button("bottom"),BorderLayout.SOUTH);
        add(new Button("Right"),BorderLayout.EAST);
        add(new Button("left"),BorderLayout.WEST);

        String msg="the border layout is " +" jhhfjnv cdjvjj \nnfjsnvjsfjns\nhfhursvjsvsjbviinnnnnnnnnnnnnnnnnnnnnnnnnnnnnvnjvnjvj "
                +"vfvfsknvnk snnnn\njsfjvjsijfvijvisjjvkfvj\nvfavsjvicjjsvjjvbbjbblbkdkbciad" +
                "ndnjdnajljoadjkjdvvnjsj\n\n\n\narajfvjajfjjcvjvfjrjjv\ndsjjghhujgbdsubsjbejubjjbfsfnjvvjsfnjnjngjjgjaj" +
                "njvnvjdjbjjmjcsv ssnvjfnj  fvff vvn vk nmjvjnjs nnjnnsdjjd mmdk n ngjgidjkngjknkjjgdngkdgkbnjgdng";
        add(new TextArea(msg),BorderLayout.CENTER);
    }
}


