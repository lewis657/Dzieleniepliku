package com.info;

        import java.io.*;
        import java.net.URL;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.nio.file.ReadOnlyFileSystemException;
        import java.util.*;

/**
 * Zadanie domowe tabele
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        ArrayList tablica = new ArrayList();
        URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = in.readLine()) != null) {
            tablica.add(line);
        }
        PrintStream fileStream = new PrintStream("all.txt");
        System.setOut(fileStream);
        int size = 1;
        // od 8 bo pomijamy heder
        for (int start = 8; start < tablica.size(); start += size) {
            int end = Math.min(start + size, tablica.size());

            List<String> sublist = tablica.subList(start, end);
            //tab.add(start);
            for (String test : sublist) {
                System.out.format("[%s]%n", test.replaceAll("[ ]{3,}", "\r"));
            }
        }
        final File file = new File("all.txt");
        final Scanner fileRead = new Scanner(file);
        int lineCount = 0;
        int i = 0;
        PrintWriter odds = new PrintWriter("odds.txt");
        PrintWriter even = new PrintWriter("even.txt");
        while (fileRead.hasNextLine())
        {
            lineCount++;
            i = lineCount % 2;
            final String str = fileRead.nextLine();
            if (i == 1 && lineCount>1 )
            {
             odds.print(str);
             odds.print("\r");

            }
            else
            {
                even.print(str);
                even.print("\r");
            }

        }
        fileRead.close();
        odds.close();
        even.close();
        in.close();

    }
}
