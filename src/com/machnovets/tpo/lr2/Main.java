package com.machnovets.tpo.lr2;

/**
 * Created by bilde_000 on 17.04.2016.
 */
public class Main {
    static public void main(String args[])
    {
        TrigFunc trig = new TrigFunc();
        double accuracy = 0.000000001;
        double y;
        Log.open("sin.csv");
        for(double i=-6.0; i<=0.0; i+=0.01)
        {
            y = trig.sin(i,accuracy);
            Log.write(i,y);
        }
        Log.open("cos.csv");
        for(double i=-9.0; i<=0.0; i+=0.01)
        {
            y = trig.cos(i, accuracy);
            Log.write(i,y);
        }
        Log.open("cot.csv");
        for(double i=-6.0; i<=0.0; i+=0.01)
        {
            y = trig.cot(i,accuracy);
            Log.write(i,y);
        }
        Log.open("sec.csv");
        for(double i=-6.0; i<=0.0; i+=0.01)
        {
            y = trig.sec(i, accuracy);
            Log.write(i,y);
        }
        Log.open("tan.csv");
        for(double i=-6.0; i<=0.0; i+=0.01)
        {
            y = trig.tan(i, accuracy);
            Log.write(i,y);
        }

    }

}
