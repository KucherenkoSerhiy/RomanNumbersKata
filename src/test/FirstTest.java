package src.test;

import org.junit.Assert;
import org.junit.Test;
import src.main.Application;

public class FirstTest {

    @Test
    public void testAdd() {
        //arrange


        //act
        String actualResponse = Application.toRomanNumber(1);

        //assert
        Assert.assertEquals("I", actualResponse);
    }

}
