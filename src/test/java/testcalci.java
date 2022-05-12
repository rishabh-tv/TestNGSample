import org.testng.*;
import org.testng.annotations.Test;


public class testcalci {

    @Test
    private void subtractingtwonumber(){
        int number1= 20;
        int number2=10;
        Calculator calci=new Calculator();
        int s=calci.subtraction(number1,number2);
        Assert.assertEquals(s,10);
    }
    @Test
    private void multiplytwonumber(){
        int number1= 20;
        int number2=10;
        Calculator calci=new Calculator();
        int s=calci.multiply(number1,number2);
        Assert.assertEquals(s,200);
    }
    @Test
    private void percentage(){
        int number1= 20;
        int number2=10;
        Calculator calci=new Calculator();
        int s=calci.percentage(number1,number2);
        Assert.assertEquals(s,200);
    }
    @Test
    private void squarenum(){
        int number1= 2;

        Calculator calci=new Calculator();
        int s=calci.square(number1);
        Assert.assertEquals(s,4);
    }
}
