

import com.machnovets.tpo.lr2.TrigFunc;
import org.junit.Assert;
import org.junit.Test;

//import static junit.framework.Assert.*;

/**
 * Created by Makhnovets on 15.04.2016.
 */
public class TrigFuncTest {
    @Test
    public void SinTest(){
        TrigFunc x=new TrigFunc();
        double a=x.sin(-7,1);
        Assert.assertTrue(a>-Math.PI);
        Assert.assertTrue(a<0);
    }


}