

import com.machnovets.tpo.lr2.TrigFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import static junit.framework.Assert.*;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class TrigFuncTest {
    TrigFunc func=new TrigFunc();
    double accurancy =0.001;
    double res;
    @Before
    public void Before(){
        res=0;
    }

    @Test
    public void SinTestPoint0(){
        double sin=0;
        res=func.sin(0,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPoint0_r(){
        double sin=0.0299955;
        res=func.sin(0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPoint0_l(){
        double sin=-0.0299955;
        res=func.sin(-0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2(){
        double sin=1;
        res=func.sin(Math.PI/2,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_r(){
        double sin=0.999550034;
        res=func.sin(Math.PI/2+0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_l(){
        double sin=0.999550034;
        res=func.sin(Math.PI/2-0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2(){
        double sin=-1;
        res=func.sin(-Math.PI/2,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_r(){
        double sin=-0.999550034;
        res=func.sin(-Math.PI/2+0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_l(){
        double sin=-0.999550034;
        res=func.sin(-Math.PI/2-0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPi(){
        double sin=0;
        res=func.sin(Math.PI,accurancy);
        System.out.println(sin+" "+res);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPi_r(){
        double sin=-0.0299955;
        res=func.sin(Math.PI+0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointPi_l(){
        double sin=0.0299955;
        res=func.sin(Math.PI-0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi(){
        double sin=0;
        res=func.sin(-Math.PI,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi_r(){
        double sin=-0.0299955;
        res=func.sin(-Math.PI+0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi_l(){
        double sin=0.0299955;
        res=func.sin(-Math.PI-0.03,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTesrPosInf(){
        double sin=Double.NaN;
        res=func.sin(Double.POSITIVE_INFINITY,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }
    @Test
    public void SinTesrNegInf(){
        double sin=Double.NaN;
        res=func.sin(Double.NEGATIVE_INFINITY,accurancy);
        Assert.assertEquals("error: sin=" +sin+" res="+res,sin,res,0.01);
    }


}