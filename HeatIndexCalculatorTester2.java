/*
 * Problem Statement: In this assignment you will develop a Java application that calculates the 
 * human-perceived equivalent temperature when the actual air temperature is combined with the 
 * relative humidity. That is to say, how hot it feels in terms of felt air temperature.
 * 
 * Author: Merdan Garlyyev
 * Date: Sept 8, 2023
 * 
 * Paragraph: This part of the code gets values from the user (temp and percentage) and then calculates 
 * the heat using the HeatIndexCalculator class. After that the output is presented.
 * 
 */
package Week4.HeatIndexCalculatorTester2;
import java.util.Scanner;

public class HeatIndexCalculatorTester2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Prompt the user for temperature and humidity input
        System.out.print("Please enter the current temperature in degree Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Please enter the current humidity as a percentage: ");
        double humidity = input.nextDouble();

        // Step 2: Calculate the heat 
        double heatIndex = HeatIndexCalculator2.calculateHeatIndex(temperature, humidity);

        // Step 3: Display the result
        System.out.println("At a temperature of " + temperature + "F and a humidity of " + humidity + 
        " percent ..." + "\n" + "It actually feels like: " + heatIndex + "F");

        input.close();
    }
    
}
