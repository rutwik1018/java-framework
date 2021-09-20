package com.company;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class mouse_frame extends Frame implements MouseListener,MouseMotionListener{
    String msg="welcome mouse";

    mouse_frame(){
        super("mose framework");
        addMouseListener(this);
        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ae)
            {
                System.exit(0);
            }
        });

                    }

    public void paint(Graphics g)
    {
        g.drawString(msg,10,50);
    }
    public void mouseEntered(MouseEvent ae)
    {
        msg="mouse entered";  repaint();
    }
    public void mouseExited(MouseEvent ae)
    {
        msg="mouse exit";   repaint();
    }
    public void mousePressed(MouseEvent ae)
    {
        msg="mouse pressed";   repaint();
    }
    public void mouseReleased(MouseEvent ae)
    {
        msg="mouse pressed";   repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        msg="mouse dragged";   repaint();
    }
    public void mouseMoved(MouseEvent ae)
    {
        msg="mouse Moved";   repaint();
    }
    public void mouseClicked(MouseEvent ae)
    {  }


}




public class frame_applet2  {
    public static void main(String[] args) {

        mouse_frame f=new mouse_frame();
        f.setSize(500,500);
        f.show();
    }
}

