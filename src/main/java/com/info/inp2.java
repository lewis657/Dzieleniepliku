package com.info;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class inp2
{
    public static void main( String[] args ) throws IOException
    {
//        String text = "ID     SALARY RANK\n" +
//                "065    12000   1\n" +
//                "023    15000   2\n" +
//                "035    25000   3\n" +
//                "076    40000   4\n";

        Scanner scanner = new Scanner(new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt").openStream());

        List<String> names = new ArrayList<String>();

// Skip column headings.

// Read each line, ensuring correct format.
        while (scanner.hasNext())
        {
            scanner.nextInt();         // read and skip 'id'
            names.add(scanner.next()); // read and store 'name'
            scanner.nextInt();         // read and skip 'age'
        }

        for (String name: names)
        {
            System.out.println(name);
        }
    }
}