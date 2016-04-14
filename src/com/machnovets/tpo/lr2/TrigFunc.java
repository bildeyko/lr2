package com.machnovets.tpo.lr2;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class TrigFunc {
    double res;
    public double sin(double x, double accurancy){
        res = 0;
        int buf;
        if (x>Math.PI){
            buf=(int)Math.floor(x/Math.PI);
            res=x-buf*Math.PI;
        }
        if (x<-Math.PI) {
            buf = (int) Math.rint(x / Math.PI);
            res = x - buf * Math.PI;
        }
            return res;
    }
}
