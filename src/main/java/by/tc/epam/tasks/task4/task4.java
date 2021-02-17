package by.tc.epam.tasks.task4;

public class task4 {
    private int[] digits;
    private boolean result;

    public boolean Start(int[] digits) {
        SetDigits(digits);

        calculateIfThereAreTwoEvenInArray();

        return result;
    }

    private void calculateIfThereAreTwoEvenInArray(){
        int counter = 0;
        for(int i = 0; i < 4; ++i){
            if (digits[i] % 2 == 0) counter++;
        }
        if (counter >= 2)
            result = true;
        else
            result = false;
    }

    private void SetDigits(int[] digits){
        this.digits = digits;
    }
}
