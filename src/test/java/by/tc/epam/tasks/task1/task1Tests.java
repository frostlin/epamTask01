package by.tc.epam.tasks.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task1Tests {
    private int number;
    private int expected;


    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {0, 0},
                {40, 0},
                {1111, 1},
                {22, 4},
                {3343, 9},
                {4, 6},
                {5535, 5},
                {16, 6},
                {-47, 9},
                {Integer.MAX_VALUE, 9},
                {Integer.MIN_VALUE, 4},
                {18, 4},
                {6789, 1}
        });
    }

    public task1Tests(int number, int expected){
        this.number = number;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        int actual;
        task1 task = new task1();;
        actual = task.Start(number);

        Assert.assertEquals(expected, actual);
    }
}

