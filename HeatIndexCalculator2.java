/*
 * Problem Statement: In this assignment you will develop a Java application that calculates the 
 * human-perceived equivalent temperature when the actual air temperature is combined with the 
 * relative humidity. That is to say, how hot it feels in terms of felt air temperature.
 * 
 * Author: Merdan Garlyyev
 * Date: Sept 8, 2023
 * Paragraph: Initially I stored the provided constants from the pdf documet. Then the method checks if 
 * temp is less than 80F or humidity less than 40%. It checks the info for validity and computues 
 * and returs the Heat Index
 */

package Week4.HeatIndexCalculatorTester2;

public class HeatIndexCalculator2 {
    // Step 1: Declare the constant values
    private static final double C1 = -42.379;
    private static final double C2 = 2.04901523;
    private static final double C3 = 10.14333127;
    private static final double C4 = -0.22475541;
    private static final double C5 = -6.83783e-03;
    private static final double C6 = -5.481717e-02;
    private static final double C7 = 1.22874e-03;
    private static final double C8 = 8.5282e-04;
    private static final double C9 = -1.99e-06;

    // Step 2: Calculate the heat index
    public static double calculateHeatIndex(double temperature, double humidity) {
        if (temperature < 80 || humidity < 40) {
            return temperature; // Return the temperature as-is if conditions not met
        }
        double T = temperature;
        double R = humidity;
        
        double heatIndex = C1 + (C2 * T) + (C3 * R) + (C4 * T * R) + (C5 * T * T) + (C6 * R * R) + (C7 * T * T * R)
                + (C8 * T * R * R) + (C9 * T * T * R * R);
        return heatIndex;
    }    
}
