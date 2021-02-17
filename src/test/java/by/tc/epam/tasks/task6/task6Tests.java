package by.tc.epam.tasks.task6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task6Tests {
    private int elapsedSeconds;
    private String expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {-124, "0:0:0"},
                {0, "0:0:0"},
                {59, "0:0:59"},
                {3601, "1:0:1"},
                {1000, "0:16:40"},
                {10000, "2:46:40"}
        });
    }

    public task6Tests(int elapsedSeconds, String expected){
        this.elapsedSeconds = elapsedSeconds;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task6 task = new task6();
        String actual = task.Start(elapsedSeconds);

        Assert.assertEquals(expected, actual);
    }
}

