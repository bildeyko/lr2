import com.machnovets.tpo.lr2.TrigFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Makhnovets on 18.04.2016.
 */
public class CotFuncTest {
    TrigFunc func;
    double accuracy;
    double res;
    String errorStr;

    double cot;
    @Before
    public void Before(){
        func = new TrigFunc();
        res = 0;
        accuracy = 0.00001;
        errorStr = "cot = %f res = %f";
    }

    @Test
    public void CotTestPoint0(){
        cot=Double.POSITIVE_INFINITY;
        res=func.cot(0,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPoint0_l(){
        cot=-33.3233327;
        res=func.cot(-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPoint0_r(){
        cot=33.3233327;
        res=func.cot(0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPiDiv2(){
        cot=0;
        res=func.cot(Math.PI/2,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPiDiv2_l(){
        cot=0.030009;
        res=func.cot((Math.PI/2)-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPiDiv2_r(){
        cot=-0.030009;
        res=func.cot(Math.PI/2+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPi(){
        cot=Double.POSITIVE_INFINITY;
        res=func.cot(Math.PI,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPi_l(){
        cot=-33.3233327;
        res=func.cot(Math.PI-0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPi_r(){
        cot=33.3233327;
        res=func.cot(Math.PI+0.03,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPointPiDiv4(){
        cot=1;
        res=func.cot(Math.PI/4,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
    @Test
    public void CotTestPoint3PiDiv4(){
        cot=-1;
        res=func.cot(3*Math.PI/4,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
}
