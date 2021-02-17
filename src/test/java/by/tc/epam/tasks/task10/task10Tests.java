package by.tc.epam.tasks.task10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class task10Tests {
    private double a;
    private double b;
    private double h;
    private String[] expected;
    @Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Object[][]{
                {1, 3, 1,
                        new String[]{
                                "1.0 1.5574",
                                "2.0 -2.1850",
                                "3.0 -0.1425"
                        }},
                {-1.5, 1.5, 1.5,
                        new String[]{
                                "-1.5 -14.1014",
                                "0.0 0.0000",
                                "1.5 14.1014",
                        }},
                {5.25, 5.5, 0.26,
                        new String[]{
                                "5.25 -1.6773",
                        }},
                {4.3, 4.2, 0.06,
                        new String[]{
                                "4.2 1.7778",
                                "4.26 2.0576",
                        }},
                {1, 1, 2,
                        new String[]{
                                "1.0 1.5574",
                        }},
        });
    }

    public task10Tests(double a, double b, double h, String[] expected){
        this.a = a;
        this.b = b;
        this.h = h;
        this.expected = expected;
    }
    @Test
    public void ActualTest(){
        task10 task = new task10();
        String[] actual = task.Start(a, b, h);

        Assert.assertArrayEquals(expected, actual);
    }
}

