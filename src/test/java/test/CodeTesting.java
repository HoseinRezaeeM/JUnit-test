package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import sorting.MyMath;

import static org.testng.Assert.fail;

public class CodeTesting {
    @Test
    public void testDivision(){
        MyMath math =new MyMath();
        Assert.assertNotNull(math);
        Assert.assertEquals(math.division(5,1),5);
        try {
            math.division(5,0);

            fail();
        }catch (Exception e){
           // Assert.assertTrue(e instanceof ArithmeticException);
        }


    }


}
