package by.tc.epam.taskset.task1;

public class TaskLastDigitPow2 {
    private int number;
    private int squareLastDigit;

    public int Start(int number) {

        SetNumber(number);
        CalculateSquareLastDigit();

        return squareLastDigit;
    }

    private void SetNumber(int number){
        this.number = number;
    }

    private void CalculateSquareLastDigit(){
        int lastDigit = number % 10;

        squareLastDigit = (lastDigit * lastDigit) % 10;

    }
}
