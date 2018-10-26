package com.info;

import javafx.scene.transform.Scale;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
                ArrayList tablica = new ArrayList();
        ArrayList tab = new ArrayList();
        //String [] tab = new String[210];


            URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
//        Scanner s =  new Scanner(new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openStream());
//
//        List<String> names = new ArrayList<String>();
//        while (s.hasNext())
//        {
//            s.nextInt();         // read and skip 'id'
//            names.add(s.next()); // read and store 'name'
//            s.nextInt();         // read and skip 'age'
//        }
//
//        for (String name: names)
//        {
//            System.out.println(name);
//        }



            while ((line = in.readLine()) != null) {

                tablica.add(line);
               // System.out.println(line);

            }

            in.close();



         int N = tablica.size();
       // N = N%2;
      //  System.out.print(N);

       // System.out.println(tablica);

        int size = 1;
        for (int start = 8; start < tablica.size(); start += size) {
            int end = Math.min(start + size, tablica.size());
            //System.out.println(end);
            List<String> sublist = tablica.subList(start, end);
            //List<String> sublist2 = tablica.subList(54, 104);
            tab.add(sublist);

           // System.out.println(sublist);
            //tab.add(start);

        }
        System.out.println(tab);


    }
}
