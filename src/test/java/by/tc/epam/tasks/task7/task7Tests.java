package by.tc.epam.tasks.task7;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task7Tests {
    private int x1, y1;
    private int x2, y2;
    private String expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {2, 2, -2, -2, "Equal"},
                {1, 1, 2, 2, "A"},
                {5, 3, 2, 3, "B"},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, "B"},
                {-10, -7, -10, -1, "B"}

        });
    }

    public task7Tests(int x1,int y1,int x2,int y2, String expected){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task7 task = new task7();
        String actual = task.Start(x1,y1,x2,y2);

        Assert.assertEquals(expected, actual);
    }
}

