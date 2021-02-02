package by.tc.epam.taskset.task6;

public class TaskElapsedSeconds {
    private int secondsElapsed;

    private int hours;
    private int minutes;
    private int seconds;

    public String Start(int secondsElapsed) {

        SetSecondsElapsed(secondsElapsed);
        CalculateElapsedTime();

        String result;
        if (secondsElapsed < 0) result = "0:0:0";
        else result = hours + ":" + minutes + ":" + seconds;
        return result;
    }

    private void SetSecondsElapsed(int sec){
        secondsElapsed = sec;
    }

    private void CalculateElapsedTime(){
        hours = secondsElapsed / 3600;
        secondsElapsed -= hours * 3600;

        minutes = secondsElapsed / 60;
        secondsElapsed -= minutes * 60;

        seconds = secondsElapsed;
    }

}
