package by.tc.epam.taskset.task10;

public class TaskFunctionInterations {
    private double a;
    private double b;
    private double h;
    private double f;
    private String[] resultStrings;
    public String[] Start(double a, double b,double h) {

       SetVars(a, b, h);
       CalculateFunction();

       return resultStrings;
    }

    private void CalculateFunction(){
        resultStrings = new String[(int)((b - a)/h) + 1];
        int i = 0;
        for (double x = a; x <= b; x += h, ++i){
            f = Math.tan(x);
            resultStrings[i] = String.format("%.4f", x) + " " + String.format("%.4f", f);
        }
    }

    private void SetVars(double a, double b, double h){
        if(a <= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
        this.h = h;
    }
}
