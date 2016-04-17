

import com.machnovets.tpo.lr2.TrigFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import static junit.framework.Assert.*;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class SinFuncTest {
    TrigFunc func;
    double accuracy;
    double res;
    String errorStr;

    double sin;
    @Before
    public void Before(){
        func = new TrigFunc();
        res = 0;
        accuracy = 0.01;
        errorStr = "sin = %f res = %f";
    }

    @Test
    public void SinTestPoint0(){
        sin=0;
        res=func.sin(0,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPoint0_r(){
        sin=0.0299955;
        res=func.sin(0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPoint0_l(){
        sin=-0.0299955;
        res=func.sin(-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2(){
        sin=1;
        res=func.sin(Math.PI/2,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_r(){
        sin=0.999550034;
        res=func.sin(Math.PI/2+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_l(){
        sin=0.999550034;
        res=func.sin(Math.PI/2-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2(){
        sin=-1;
        res=func.sin(-Math.PI/2,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_r(){
        sin=-0.999550034;
        res=func.sin(-Math.PI/2+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_l(){
        sin=-0.999550034;
        res=func.sin(-Math.PI/2-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPi(){
        sin=0;
        res=func.sin(Math.PI,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPi_r(){
        sin=-0.0299955;
        res=func.sin(Math.PI+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointPi_l(){
        sin=0.0299955;
        res=func.sin(Math.PI-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi(){
        sin=0;
        res=func.sin(-Math.PI,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi_r(){
        sin=-0.0299955;
        res=func.sin(-Math.PI+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPointMPi_l(){
        sin=0.0299955;
        res=func.sin(-Math.PI-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestPosInf(){
        sin=Double.NaN;
        res=func.sin(Double.POSITIVE_INFINITY,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }
    @Test
    public void SinTestNegInf(){
        sin=Double.NaN;
        res=func.sin(Double.NEGATIVE_INFINITY,accuracy);
        Assert.assertEquals(String.format(errorStr, sin, res),sin,res,0.01);
    }


}