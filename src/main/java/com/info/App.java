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


//        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
//        Scanner s = new Scanner(url.openStream());
//        String line = s.nextLine();
//        System.out.println(line);

//        URLConnection connection = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openStream();
//        InputStream stream = connection.getInputStream();
//
//        System.out.println("total size: "+connection.getContentLength();

//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
//
//        int count;
//        byte buffer[] = new byte[1024];
//
//        while ((count = bufferedInputStream.read(buffer, 0, buffer.length)) != -1)
//            fileOutputStream.write(buffer, 0, count);


        ArrayList tablica = new ArrayList();
        try {

            URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            while ((line = in.readLine()) != null) {

                tablica.add(line);
               // System.out.println(line);

            }

            in.close();

        }

	        catch (MalformedURLException e) {

        System.out.println("Malformed URL: " + e.getMessage());

    }

	        catch (IOException e) {

        System.out.println("I/O Error: " + e.getMessage());

    }

         int N = tablica.size();
       // N = N%2;
      //  System.out.print(N);

       // System.out.println(tablica);

        int size = 1;
        for (int start = 8; start < tablica.size(); start += size) {
            int end = Math.min(start + size, tablica.size());
            System.out.println(end);
            List<String> sublist1 = tablica.subList(start, 25);
            List<String> sublist2 = tablica.subList(54, 104);

            System.out.println(sublist1);
        }
    }
}
