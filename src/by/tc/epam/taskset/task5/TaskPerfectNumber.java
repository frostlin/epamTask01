package by.tc.epam.taskset.task5;

public class TaskPerfectNumber {
    private int number;
    private boolean isNumberPerfect;

    public boolean Start(int number) {

        SetNumber(number);
        CalculateIsNumberPerfect();

        return isNumberPerfect;
    }


    private void SetNumber(int number){
        this.number = number;
    }

    private void CalculateIsNumberPerfect(){
        int sumOfDivisors = 1;
        for (int i = 2; i < number; ++i){
            if (number % i == 0) sumOfDivisors += i;
        }
        if (sumOfDivisors == number)
            isNumberPerfect = true;
        else
            isNumberPerfect = false;
    }
}
