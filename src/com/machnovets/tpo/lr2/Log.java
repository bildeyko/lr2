package com.machnovets.tpo.lr2;

import java.io.*;

/**
 * Created by bilde_000 on 17.04.2016.
 */
public class Log {
    static String filename;

    public static void write(double x, double y)
    {
        String str = "%f;%f\n";

        try(FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.write(String.format(str, x, y));
        } catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void open(String name)
    {
        filename = name;
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
