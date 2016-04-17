import com.machnovets.tpo.lr2.LnFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Makhnovets on 17.04.2016.
 */
public class LnFuncTest {
    LnFunc func;
    double accuracy;
    double res;
    double ln;
    @Before
    public void before(){
        func=new LnFunc();
        accuracy =0.001;
        res=0;
    }
    @Test
    public void LnTestPoint0(){
        ln=Double.NEGATIVE_INFINITY;
        res=func.ln(0,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPoint0_l(){
        ln=Double.NaN;
        res=func.ln(-0.01,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPoint0_r(){
        ln=-4.605170;
        res=func.ln(0.01,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPoint1(){
        ln=0;
        res=func.ln(1,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPoint1_l(){
        ln=-0.0100503;
        res=func.ln(1-0.01,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPoint1_r(){
        ln=0.00995033;
        res=func.ln(1,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPosInf(){
        ln=Double.POSITIVE_INFINITY;
        res=func.ln(Double.POSITIVE_INFINITY,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestNegInf(){
        ln=Double.NaN;
        res=func.ln(Double.NEGATIVE_INFINITY,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPointE(){
        ln=1;
        res=func.ln(2.718281828,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
    @Test
    public void LnTestPointEin2(){
        ln=2;
        res=func.ln(2.718281828*2.718281828,accuracy);
        Assert.assertEquals("error: sin=" +ln+" res="+res,ln,res,0.01);
    }
}
