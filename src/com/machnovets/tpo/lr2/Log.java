package com.machnovets.tpo.lr2;

import java.io.*;

/**
 * Created by bilde_000 on 17.04.2016.
 */
public class Log {
    static String filename;
    static BufferedWriter bw;

    public static void write(double x, double y)
    {
        String str = "%.2f;%f\n";

        try
        {
            bw.write(String.format(str, x, y));
        } catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void close()
    {
        try
        {
            bw.close();
        } catch (Exception ex)
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
            FileWriter fw = new FileWriter(filename, true);
            bw = new BufferedWriter(fw);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
