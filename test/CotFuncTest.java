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
        cot=1;
        res=func.cos(0,accuracy);
        Assert.assertEquals(String.format(errorStr, cot, res),cot,res,0.01);
    }
}
