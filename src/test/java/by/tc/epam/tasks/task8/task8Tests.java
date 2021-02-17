package by.tc.epam.tasks.task8;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task8Tests {
    private double x;
    private double expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {Math.cbrt(6), Double.POSITIVE_INFINITY},
                {1, -0.2},
                {2, 0.5},
                {3, 9},
                {10, -61},

        });
    }

    public task8Tests(double x, double expected){
        this.x = x;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task8 task = new task8();
        double actual = task.Start(x);

        Assert.assertEquals(expected, actual, 0.0001);
    }
}

