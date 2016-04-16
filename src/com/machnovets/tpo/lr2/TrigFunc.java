package com.machnovets.tpo.lr2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class TrigFunc {
    public double sin(double x, double accuracy){
        boolean negative;
        Double buf;
        Double y=0.0;
        int n=0;
        if(x<-Math.PI||x>Math.PI){
            buf=x/(2*Math.PI);
            if (x%(2*Math.PI)==0){
                x-=2*Math.PI*buf.intValue();
            }
            x-=2*Math.PI*(buf.intValue()+1);
        }
        if (x>=-Math.PI&&x<0){
            negative=true;
            x=Math.abs(x);
        }
        else
        {
            negative=false;
        }
        while (true){
            BigDecimal tmpBig=BigDecimal.valueOf(Math.pow(-1,n));
            tmpBig.multiply(BigDecimal.valueOf(Math.pow(x,2*n+1)));
            tmpBig.divide(factorial(2*n+1),BigDecimal.valueOf(accuracy).scale(),RoundingMode.HALF_UP);
            Double tmpDub=Math.abs(tmpBig.doubleValue());
            if (tmpDub>accuracy)
                y+=tmpDub;
            else
                break;
            n++;
        }
        if (negative)
            return -y;
        else
            return y;

    }

    private BigDecimal factorial(int num) {
        BigDecimal fact = BigDecimal.valueOf(1);

        for (; num > 0; fact = fact.multiply(BigDecimal.valueOf(num--))) ;

        return fact;
    }
}
