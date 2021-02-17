package by.tc.epam.tasks.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task3Tests {
    private double outerSquareArea;
    private double expected;

    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {4, 1},
                {-214, -1},
                {15, 3.75},
                {Integer.MIN_VALUE, -1},
                {Double.MAX_VALUE, Double.MAX_VALUE / 4},
        });
    }

    public task3Tests(double outerSquareArea, double expected){
        this.outerSquareArea = outerSquareArea;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task3 task = new task3();
        double actual = task.Start(outerSquareArea);

        Assert.assertEquals(expected, actual, 0.0001);
    }
}

