import com.machnovets.tpo.lr2.Dummies.TrigDummies;
import com.machnovets.tpo.lr2.TrigFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Makhnovets on 17.04.2016.
 */
public class CosFuncTest {
    TrigFunc func;
    TrigDummies dummies;
    double accuracy;
    double res;
    String errorStr;

    double cos;
    @Before
    public void Before(){
        func = new TrigFunc();
        dummies = new TrigDummies();
        res = 0;
        accuracy = 0.00001;
        errorStr = "cos = %f res = %f";
    }

    @Test
    public void CosTestPoint0(){
        cos=1;
        res=func.cos(-0.00,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPoint0_r(){
        cos=0.999550034;
        res=func.cos(0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPoint0_l(){
        cos=0.999550034;
        res=func.cos(-0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPiDiv2(){
        cos=0;
        res=func.cos(Math.PI/2,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPiDiv2_r(){
        cos=-0.0299955;
        res=func.cos(Math.PI/2+0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPiDiv2_l(){
        cos=0.0299955;
        res=func.cos(Math.PI/2-0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointMPiDiv2(){
        cos=0;
        res=func.cos(-Math.PI/2,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointMPiDiv2_r(){
        cos=0.0299955;
        res=func.cos(-Math.PI/2+0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointMPiDiv2_l(){
        cos=-0.0299955;
        res=func.cos(-Math.PI/2-0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPoint3PiDiv2(){
        cos=0;
        res=func.cos(3*Math.PI/2,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPoint3PiDiv2_l(){
        cos=-0.0299955;
        res=func.cos(3*Math.PI/2-0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPoint3PiDiv2_r(){
        cos=0.0299955;
        res=func.cos(3*Math.PI/2+0.03,accuracy,dummies);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPi_r(){
        cos=-0.999550034;
        res=func.cos(Math.PI+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPi_l(){
        cos=-0.999550034;
        res=func.cos(Math.PI-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPointPi(){
        cos=-1;
        res=func.cos(-Math.PI,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestPosinsf(){
        cos=Double.NaN;
        res=func.cos(Double.POSITIVE_INFINITY,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestNegInf(){
        cos=Double.NaN;
        res=func.cos(Double.NEGATIVE_INFINITY,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestNeg1(){
        cos=0.993;
        res=func.cos(-6.28,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestNeg2(){
        cos=0.993;
        res=func.cos(-6.29,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
    @Test
    public void cosTestNeg3(){
        cos=0.993;
        res=func.cos(-6.27,accuracy);
        Assert.assertEquals(String.format(errorStr, cos, res),cos,res,0.01);
    }
}
