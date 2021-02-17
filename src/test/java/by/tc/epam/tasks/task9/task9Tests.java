package by.tc.epam.tasks.task9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task9Tests {
    private double r;
    private double[] expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {-14, new double[]{0, 0}},
                {0, new double[]{0, 0}},
                {3, new double[]{18.849, 28.274}},
                {10, new double[]{62.831, 314.159}},
        });
    }

    public task9Tests(double r, double[] expected){
        this.r = r;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task9 task = new task9();
        double[] actual = task.Start(r);

        Assert.assertArrayEquals(expected, actual, 0.001);
    }
}

