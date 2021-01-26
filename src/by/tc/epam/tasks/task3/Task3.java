package by.tc.epam.tasks.task3;

public class Task3 {
    private double outerSquareArea;
    private double innerSquareArea;

    public double Start(double outerSquareArea) {

        SetOuterSquareArea(outerSquareArea);
        CalculateInnerSquareArea();

        return innerSquareArea;
    }

    private void SetOuterSquareArea(double outer){
        outerSquareArea = outer;
    }

    private void CalculateInnerSquareArea(){
        innerSquareArea = -1;
        if (outerSquareArea <=0) return;
        innerSquareArea = outerSquareArea / 4;
    }
}
