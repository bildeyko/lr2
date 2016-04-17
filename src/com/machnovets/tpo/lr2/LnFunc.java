package com.machnovets.tpo.lr2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Makhnovets on 17.04.2016.
 */
public class LnFunc {
    public double ln(double x,double accuracy){
        double y=0;
        int n=1;
        if (x == Double.NEGATIVE_INFINITY || x < 0)
            return Double.NaN;
        if (x == Double.POSITIVE_INFINITY)
            return Double.POSITIVE_INFINITY;

        while(true)
        {
            BigDecimal xBig = BigDecimal.valueOf(x);
            BigDecimal oneBig = BigDecimal.valueOf(1);

            BigDecimal tmpBig1 = xBig.subtract(oneBig);
            BigDecimal tmpBig2 = xBig.add(oneBig);

            tmpBig1 = tmpBig1.divide(tmpBig2,BigDecimal.valueOf(accuracy).scale(), RoundingMode.HALF_UP);
            tmpBig1 = tmpBig1.pow(2*n - 1);
            tmpBig1 = tmpBig1.divide(BigDecimal.valueOf(2*n - 1),BigDecimal.valueOf(accuracy).scale(), RoundingMode.HALF_UP);

            Double tmpDub=tmpBig1.doubleValue();
            if (Math.abs(tmpDub)>accuracy)
                y+=tmpDub;
            else
                break;
            n++;
        }
        return y*2;
    }
}
