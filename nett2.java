package com.company;

import java.net.*;
import java.io.*;
import java.util.*;
class nett2 {
    public static void main(String args[]) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        //----------------------
        long date = hpCon.getDate();
        if (date == 0)
            System.out.println("No date information.");
        else
            System.out.println("Date :-->" + new Date(date));
        //---------------------------------------------
        date = hpCon.getExpiration();
        if (date == 0)
            System.out.println("No expiration information.");
        else
            System.out.println(" expires Date :-->" + new Date(date));
        //-------------------
        date = hpCon.getLastModified();
        if (date == 0)
            System.out.println("No last modified  information.");
        else
            System.out.println(" expires Date :-->" + new Date(date));

        int len = hpCon.getContentLength();

        if (len == -1)
            System.out.println("Content Lenght unavailable");
        else
            System.out.println("Content Lenght : " + len);


//geeting html code of any wesite
        if (len != 0) {
            System.out.println("====Contentent====");
            InputStream input = hpCon.getInputStream();
            int i = len;
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        }
        else{
                System.out.println("No content availabel");
            }

    }
}