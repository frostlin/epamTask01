package by.tc.epam.tasks.task2;

public class task2 {
    private int month;
    private int year;
    private static int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int daysInThisMonthCount;

    public int Start(int month, int year) {

        SetMonth(month);
        SetYear(year);

        CalculateDaysCount();

        return daysInThisMonthCount;
    }

    private void CalculateDaysCount(){
        daysInThisMonthCount = -1;
        if (month < 1 || month > 12) return;

        daysInThisMonthCount = days[month - 1];
        if(month == 2 && year % 4 == 0) daysInThisMonthCount++;
    }

    private void SetMonth(int month){
        this.month = month;
    }

    private void SetYear(int year){
        this.year = year;
    }
}
