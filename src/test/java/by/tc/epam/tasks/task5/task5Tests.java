package by.tc.epam.tasks.task5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task5Tests {
    private int number;
    private boolean expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {2, false},
                {-5, false},
                {6, true},
                {496, true},
                {0, false}
        });
    }

    public task5Tests(int number, boolean expected){
        this.number = number;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task5 task = new task5();
        boolean actual = task.Start(number);

        Assert.assertEquals(expected, actual);
    }
}

