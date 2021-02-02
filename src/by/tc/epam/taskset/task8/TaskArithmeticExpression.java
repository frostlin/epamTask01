package by.tc.epam.taskset.task8;

public class TaskArithmeticExpression {
    private double f;
    private double x;

    public double Start(double x) {

        SetX(x);
        CalculateF();
        return f;
    }

    private void SetX(double x){
        this.x = x;
    }
    private void CalculateF() throws ArithmeticException{
        if (x >= 3)
            f = 3 * x - Math.pow(x, 2) + 9;
        else
            f = 1 / (Math.pow(x, 3) - 6);

    }
}
