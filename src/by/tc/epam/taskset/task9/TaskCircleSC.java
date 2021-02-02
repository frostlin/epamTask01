package by.tc.epam.taskset.task9;

public class TaskCircleSC {
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
