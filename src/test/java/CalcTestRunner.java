import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Do sum")
    public void doSum(){
        CalcScreen screen = new CalcScreen(driver);
        String value = screen.doSum(6,3);
        System.out.println(value);
        Assert.assertEquals(value,"9");
    }
}
