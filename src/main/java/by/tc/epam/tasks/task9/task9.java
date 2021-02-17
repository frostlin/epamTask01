package by.tc.epam.tasks.task9;

import java.util.Arrays;
import java.util.Collection;

public class task9 {
    private double r;
    private double c, s;
    public double[] Start(double r) {
        SetRadius(r);
        Calculate();
        return new double[]{c, s};
    }

    public void Calculate(){
        if(r < 0) {
            c = 0; s = 0;
        } else {
            c = 2 * r * Math.PI;
            s = Math.pow(r, 2) * Math.PI;
        }

    }
    public void SetRadius(double r){
        this.r = r;
    }
}
