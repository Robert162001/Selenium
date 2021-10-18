import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Helpers;

public class HelpersTest {
    private Helpers helpers;


    @Test
    public void generateRandomTest1() {
        int var1 = Helpers.generateRandomNumber(1, 6);
        Assert.assertTrue(var1 == 1 || var1 == 2 || var1 == 3 || var1 == 4 || var1 == 5 || var1 == 6);
    }

    @Test
    public void generateRandomTest2() {
        int var2 = Helpers.generateRandomNumber(-2, -1);
        Assert.assertTrue(var2 == -2 || var2 == -1);
    }

    @Test
    public void generateRandomTest3() {
        int var3 = Helpers.generateRandomNumber(1, 3);
        Assert.assertTrue(var3 == 1 || var3 == 2 || var3 == 3);
    }
}

