
package com.company;
import java.net.*;
class nett1
{
    public static void main(String args[]) throws MalformedURLException  // only Exception bhi chalega
    {
        URL hp=new URL("http://www.msbte.com/exam");
        System.out.println("protocoal  :"+hp.getProtocol());
        System.out.println("Port:"+hp.getPort());
        System.out.println("Port:"+hp.getHost());
        System.out.println("Port:"+hp.getFile());
        System.out.println("Exit :"+hp.toExternalForm());
    }
}