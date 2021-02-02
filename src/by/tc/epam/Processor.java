package by.tc.epam;

import by.tc.epam.taskset.task1.TaskLastDigitPow2;
import by.tc.epam.taskset.task10.TaskFunctionInterations;
import by.tc.epam.taskset.task2.TaskDaysInMonthCount;
import by.tc.epam.taskset.task3.TaskSquareArea;
import by.tc.epam.taskset.task4.TaskTwoEvenNumbers;
import by.tc.epam.taskset.task5.TaskPerfectNumber;
import by.tc.epam.taskset.task6.TaskElapsedSeconds;
import by.tc.epam.taskset.task7.TaskDistanceToZero;
import by.tc.epam.taskset.task8.TaskArithmeticExpression;
import by.tc.epam.taskset.task9.TaskCircleSC;

public class Processor {
    public static void main(String[] args) {
        int taskNumber = Integer.parseInt(args[0]);
        if (taskNumber >= 0 && taskNumber <= 10) {
            switch (taskNumber) {
                case 1: {
                    TaskLastDigitPow2 task = new TaskLastDigitPow2();
                    int number = Integer.parseInt(args[1]);

                    int result = task.Start(number);
                    System.out.println(result);
                    break;
                }
                case 2: {
                    TaskDaysInMonthCount task = new TaskDaysInMonthCount();
                    int month = Integer.parseInt(args[1]);
                    int year = Integer.parseInt(args[2]);

                    int result = task.Start(month, year);
                    System.out.println(result);
                    break;
                }
                case 3: {
                    TaskSquareArea task = new TaskSquareArea();
                    double outerSquareArea = Double.parseDouble(args[1]);

                    double result = task.Start(outerSquareArea);
                    System.out.println(result);
                    break;
                }
                case 4: {
                    TaskTwoEvenNumbers task = new TaskTwoEvenNumbers();
                    int a = Integer.parseInt(args[1]);
                    int b = Integer.parseInt(args[2]);
                    int c = Integer.parseInt(args[3]);
                    int d = Integer.parseInt(args[4]);

                    boolean result = task.Start(new int[]{a, b, c, d});
                    System.out.println(result);
                    break;
                }
                case 5: {
                    TaskPerfectNumber task = new TaskPerfectNumber();
                    int number = Integer.parseInt(args[1]);

                    boolean result = task.Start(number);
                    System.out.println(result);
                    break;
                }
                case 6: {
                    TaskElapsedSeconds task = new TaskElapsedSeconds();
                    int seconds = Integer.parseInt(args[1]);

                    String result = task.Start(seconds);
                    System.out.println(result);
                    break;
                }
                case 7: {
                    TaskDistanceToZero task = new TaskDistanceToZero();
                    int a = Integer.parseInt(args[1]);
                    int b = Integer.parseInt(args[2]);
                    int c = Integer.parseInt(args[3]);
                    int d = Integer.parseInt(args[4]);

                    String result = task.Start(a, b, c, d);
                    System.out.println(result);
                    break;
                }
                case 8: {
                    TaskArithmeticExpression task = new TaskArithmeticExpression();
                    double x = Double.parseDouble(args[1]);

                    double result = task.Start(x);
                    System.out.println(result);
                    break;
                }
                case 9: {
                    TaskCircleSC task = new TaskCircleSC();
                    double radius = Double.parseDouble(args[1]);

                    double[] result = task.Start(radius);
                    System.out.println(result[0] + " " + result[1]);
                    break;
                }
                case 10: {
                    TaskFunctionInterations task = new TaskFunctionInterations();
                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double h = Double.parseDouble(args[2]);

                    String[] result = task.Start(a,b,h);
                    for (int i = 0; i < result.length; ++i) {
                        System.out.println(result[i]);
                    }

                    break;
                }
            }
        }

    }
}