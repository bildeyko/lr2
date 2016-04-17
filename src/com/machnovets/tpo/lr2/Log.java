package com.machnovets.tpo.lr2;

import java.io.*;

/**
 * Created by bilde_000 on 17.04.2016.
 */
public class Log {
    static String filename = "logs.csv";
    static
    {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.write("x;func;y\n");
            writer.close();
        } catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void write(String func, double x, double y)
    {
        String str = "%f;%s;%f\n";

        try(FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.write(String.format(str, x, func, y));
        } catch (IOException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
