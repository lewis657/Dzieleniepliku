package com.info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class inp
{
    public static void main( String[] args ) throws IOException
    {
//        String text = "ID     SALARY RANK\n" +
//                "065    12000   1\n" +
//                "023    15000   2\n" +
//                "035    25000   3\n" +
//                "076    40000   4\n";

        Scanner scanner = new Scanner(new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openStream());


      //  System.out.println(scanner);
        String nextLine = scanner.nextLine();

//regex to break on any ammount of spaces
       // String regex = "\\s*     \\s*";
        String regex = "ISO 8859-1 (1987)";



     //   String[] row = new String[155000000];

        while (scanner.hasNext()) {
            String[] row = scanner.nextLine().split(regex);
             //row = scanner.nextLine().split(regex);
          //  String row = scanner.nextLine();

           // scanner.delimiter()

            //this is printing all columns, you can
            //access each column from row using the array
            //indexes, example row[0], row[1], row[2]...
         //   System.out.println(Arrays.toString(row));
           // System.out.println(row[0]);//first column (ID)
          //  System.out.println(row[0]);//first column (ID)
//            for (int i =0; i< row.length; i++ )
//            {
//                System.out.println(" Numer row " + i);
//                System.out.println(row[i]);
//            }

            System.out.println(row[0]);//first column (ID)

        }
        //System.out.println(nextLine);


    }
}
