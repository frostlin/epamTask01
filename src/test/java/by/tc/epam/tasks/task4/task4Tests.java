package by.tc.epam.tasks.task4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task4Tests {
    private int[] digits;
    private boolean expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {new int[] {1, 1, 1, 1}, false},
                {new int[] {3, 2, 3, 3}, false},
                {new int[] {1, 1, 4, 2}, true},
                {new int[] {0, 0, 0, 0}, true},
                {new int[] {-51, Integer.MAX_VALUE, Integer.MIN_VALUE, 7}, false},

        });
    }

    public task4Tests(int[] digits, boolean expected){
        this.digits = digits;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task4 task = new task4();
        boolean actual = task.Start(digits);

        Assert.assertEquals(expected, actual);
    }
}

