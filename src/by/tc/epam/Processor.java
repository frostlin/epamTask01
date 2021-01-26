package by.tc.epam;

import by.tc.epam.tasks.task1.Task1;
import by.tc.epam.tasks.task10.Task10;
import by.tc.epam.tasks.task2.Task2;
import by.tc.epam.tasks.task3.Task3;
import by.tc.epam.tasks.task4.Task4;
import by.tc.epam.tasks.task5.Task5;
import by.tc.epam.tasks.task6.Task6;
import by.tc.epam.tasks.task7.Task7;
import by.tc.epam.tasks.task8.Task8;
import by.tc.epam.tasks.task9.Task9;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        int number = 0;
        Scanner in = new Scanner(System.in);
        while (number != -1){
            System.out.println("Pick task number 1 to 10\nPick -1 to exit\nTask: ");

            number = in.nextInt();
            if (number >= 0 && number <= 10){
                switch(number){
                    case 1: {
                        Task1 task = new Task1();
                        System.out.println(task.Start(in.nextInt()));
                        break;
                    }
                    case 2: {
                        Task2 task = new Task2();
                        System.out.println(task.Start(in.nextInt(), in.nextInt()));
                        break;
                    }
                    case 3: {
                        Task3 task = new Task3();
                        System.out.println(task.Start(in.nextDouble()));
                        break;
                    }
                    case 4: {

                        Task4 task = new Task4();
                        System.out.println(task.Start(new int[]{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()}));
                        break;
                    }
                    case 5: {
                        Task5 task = new Task5();
                        System.out.println(task.Start(in.nextInt()));
                        break;
                    }
                    case 6: {
                        Task6 task = new Task6();
                        System.out.println(task.Start(in.nextInt()));
                        break;
                    }
                    case 7: {
                        Task7 task = new Task7();
                        System.out.println(task.Start(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()));
                        break;
                    }
                    case 8: {
                        Task8 task = new Task8();
                        System.out.println(task.Start(in.nextDouble()));
                        break;
                    }
                    case 9: {
                        Task9 task = new Task9();
                        System.out.println(task.Start(in.nextDouble()));
                        break;
                    }
                    case 10: {
                        Task10 task = new Task10();
                        String[] result = task.Start(in.nextDouble(), in.nextDouble(), in.nextDouble());
                        for (int i = 0; i < result.length; ++i){
                            System.out.println(result[i]);
                        }

                        break;
                    }
                }
            }
        }

    }
}