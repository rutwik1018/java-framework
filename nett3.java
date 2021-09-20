package com.company;

import java.io.InputStream;
import java.net.*;

public class  nett3 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address1 = InetAddress.getLocalHost();
        System.out.println(Address1);
        Address1 = InetAddress.getByName("java.sun.com");
        System.out.println(Address1);

        InetAddress SW[] = InetAddress.getAllByName("http://www.internic.net");
        int len = SW.length;
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }




    }
}