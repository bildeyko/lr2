package com.machnovets.tpo.lr2;

import com.machnovets.tpo.lr2.Dummies.TrigDummies;

import java.math.BigDecimal;

/**
 * Created by bilde_000 on 17.04.2016.
 */
public class Main {
    static public void main(String args[])
    {

        genValues();
        TrigDummies dummies = new TrigDummies();
    }

    static private void genValues()
    {
        TrigFunc trig = new TrigFunc();
        double accuracy = 0.00001;
        double y;
        Log.open("sin.csv");
        double init = 3 * Math.PI;
        for(double i=-init; i<=init; i+=0.01) {
            y = trig.sin(i, accuracy);
            Log.write(i, y);
        }
        Log.write(0.00, trig.sin(0.00, accuracy));
        Log.close();
        System.out.println("Sin values created");

        Log.open("cos.csv");
        for(double i=-init; i<=init; i+=0.01)
        {
            y = trig.cos(i, accuracy);
            Log.write(i,y);
        }
        Log.write(0.00, trig.cos(0.00, accuracy));
        Log.close();
        System.out.println("Cos values created");

        Log.open("cot.csv");
        for(double i=-init; i<=init; i+=0.01)
        {
            y = trig.cot(i,accuracy);
            Log.write(i,y);
        }
        Log.write(0.00, trig.cot(0.00, accuracy));
        Log.close();
        System.out.println("Cot values created");

        Log.open("sec.csv");
        for(double i=-init; i<=init; i+=0.01)
        {
            y = trig.sec(i, accuracy);
            Log.write(i,y);
        }
        Log.write(0.00, trig.sec(0.00, accuracy));
        Log.close();
        System.out.println("Sec values created");

        Log.open("tan.csv");
        for(double i=-init; i<=init; i+=0.01)
        {
            y = trig.tan(i, accuracy);
            Log.write(i,y);
        }
        Log.write(0.00, trig.tan(0.00, accuracy));
        Log.close();
        System.out.println("Tan values created");
    }

}
