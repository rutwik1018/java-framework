package com.company;

import java.io.*;
import java.net.*;
//this is programm makes a soket connection to the atomical cl. in boulder,colorado.
// and prints the time that the server sends
public class socket11 {
  public static void main(String[] args) {
    try{
        Socket s =new Socket("time-A.timefreq.bldrdoc.gov",13);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        boolean more =true;

        while(more)
        {
            String line=br.readLine();
            if(line==null)
                more=false;
            else
                System.out.println(line);
        }

    }
    catch (IOException e)
    { e.printStackTrace();                                       }


  }


}


