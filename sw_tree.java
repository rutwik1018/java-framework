package com.company;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;
        import javax.swing.tree.*;

public class sw_tree extends JApplet {
    JTree tree;
    JTextField jtf;

    public void init() {
        Container c1 = getContentPane();
        c1.setLayout(new BorderLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("select");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Colors");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("red");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("yellow");
        a.add(a2);
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("green");
        a.add(a3);

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("game");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("cricket");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode(" football");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("chess");
        b.add(b3);

        tree = new JTree(top);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        JScrollPane jsp = new JScrollPane(tree, v, h);
        c1.add(jsp, BorderLayout.CENTER);

        jtf = new JTextField(" ", 20);
        c1.add(jtf, BorderLayout.SOUTH);

        //------------
        tree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
                if (tp != null)
                    jtf.setText(tp.toString());
                else
                    jtf.setText("");
            }
        });
    }
}


