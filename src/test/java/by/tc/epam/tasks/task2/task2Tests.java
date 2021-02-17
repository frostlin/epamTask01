package by.tc.epam.tasks.task2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task2Tests {
    private int month;
    private int year;
    private int expected;

    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {1, 2013, 31},
                {2, 2012, 29},
                {2, 2013, 28},
                {Integer.MAX_VALUE, 2013, -1},
                {Integer.MIN_VALUE, 2013, -1},
                {11, -12, 30},
        });
    }

    public task2Tests(int month, int year, int expected){
        this.month = month;
        this.year = year;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        int actual;
        task2 task = new task2();
        actual = task.Start(month, year);

        Assert.assertEquals(expected, actual);
    }
}

