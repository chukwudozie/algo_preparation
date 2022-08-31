package java_learning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This task computes the average temperature based on the number of days the user inputs
 */
public class AverageTemperature {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AverageTemperature temperature = new AverageTemperature();
        temperature.computeTemperature();
    }


    public void computeTemperature(){
        System.out.println("Average temperature calculator\n==============================");
        System.out.println("Enter the number of days you wish to calculate average temperature");
        int numberOfDays = scanner.nextInt();
        int [] dailyTemperature = new int[numberOfDays];
        double sumOfTemperature = 0;
        int count = 0;
        for (int i = 1; i <= numberOfDays; i++){
            System.out.print("Enter the temperature for day "+(i)+": ");
            dailyTemperature[i - 1] = scanner.nextInt();
            sumOfTemperature += dailyTemperature[i - 1];
        }

        double average = sumOfTemperature/numberOfDays;
        for (int i : dailyTemperature) {
            if (i > average) {
                count++;
            }
        }
        System.out.println("Average temperature is "+sumOfTemperature/numberOfDays);
        System.out.println(count+" day(s) above average");
    }
}
