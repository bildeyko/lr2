package com.machnovets.tpo.lr2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class TrigFunc implements ITrigonometry {
    private double offset(double x,double accuracy){
        BigDecimal buf;
        BigDecimal newX=BigDecimal.valueOf(x);
        if(newX.doubleValue()<-Math.PI||newX.doubleValue()>Math.PI){
            buf=newX.divide(BigDecimal.valueOf(2*Math.PI),BigDecimal.valueOf(accuracy).scale(),RoundingMode.HALF_UP);
            if (x%(2*Math.PI)==0){
                x=x-2*Math.PI*buf.intValue();
            }
            if(x<-1) {
                x -= 2*Math.PI * (buf.intValue() - 1);
            }
            else
            {
                x -= 2*Math.PI * (buf.intValue() + 1);

            }
        }
        return x;
    }
    private boolean negativeForSin(double x){
        if (x>=-Math.PI&&x<0){
            return true;
        }
        else
        {
            return false;
        }

    }
    public double sin(double x, double accuracy){
        boolean negative;
        Double y=0.0;
        int n=0;

        if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
            return Double.NaN;
        }
        x=offset(x,accuracy);
        negative=negativeForSin(x);

        if (negative)
            x=Math.abs(offset(x,accuracy));

        while (true){
            BigDecimal fIt=BigDecimal.valueOf(-1);
            fIt=fIt.pow(n);
            BigDecimal sIt=BigDecimal.valueOf(x);
            sIt=sIt.pow(2*n+1);
            BigDecimal tmpBig=fIt.multiply(sIt);
            tmpBig=tmpBig.divide(factorial(2*n+1),BigDecimal.valueOf(accuracy).scale(),RoundingMode.HALF_UP);
            Double tmpDub=tmpBig.doubleValue();
            if (Math.abs(tmpDub)>accuracy)
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

    public double cos(double x, double accuracy)
    {
        if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
            return Double.NaN;
        }
        boolean negative;

        double y, tmp;

        x=offset(x,accuracy);

        if (offset(x,accuracy)>=-Math.PI/2&&offset(x,accuracy)<=Math.PI/2)
            negative=false;
        else
            negative=true;
        tmp=sin(x,accuracy);
        y=BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(tmp).pow(2)).abs().doubleValue();
        y=Math.pow(y,0.5);

        if (negative)
            return -y;
        else
            return y;
    }

    public double cot(double x, double accuracy)
    {
        if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
            return Double.NaN;
        }
        double y;
        y = cos(x, accuracy) / sin(x, accuracy);
        return y;
    }

    public double sec(double x, double accuracy)
    {
        if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
            return Double.NaN;
        }
        double y;
        y = 1 / cos(x, accuracy);
        return y;
    }

    public double tan(double x, double accuracy)
    {
        if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
            return Double.NaN;
        }
        double y;
        y = sin(x, accuracy) / cos(x, accuracy);
        return y;
    }

    private BigDecimal factorial(int num) {
        BigDecimal fact = BigDecimal.valueOf(1);

        for (; num > 0; fact = fact.multiply(BigDecimal.valueOf(num--))) ;

        return fact;
    }
}
