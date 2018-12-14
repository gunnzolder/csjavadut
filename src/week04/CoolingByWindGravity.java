package week04;

/*************************************************************************
 * Name: Anton Parkhomenko
 * NetID: parkhomenko.av
 * Precept: week 04
 *
 * Given the temperature t (in Fahrenheit) and the wind speed v
 * (in miles per hour), compute the wind chill w using the formula
 * from the National Weather Service.
 *
 *      w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 * Reference:  https://www.weather.gov/safety/cold-wind-chill-chart
 *
 * The wind chill formula is only valid if the wind speed
 * is above 3MPH and below 110MPH and the temperature is below 50 degrees
 * Fahrenheit and above -50 degrees. Modify your solution to print an error
 * message if the user types in a value outside the allowable range.
 *
 *************************************************************************/

public class CoolingByWindGravity {
    public static void main(String[] args) {

        long t = Integer.parseInt(args[0]),
                v = Integer.parseInt(args[1]);
        try {
            week04.CoolingByWindGravity.calculateWindTemp(t, v);
        } catch (WindTempException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void calculateWindTemp(long t, long v) throws WindTempException {

        String errorMessage = "";

        if (t < -50) errorMessage += "\n ⚠ Temperature " + t + "F looks like too low (less than -50F); ";
        if (t > 50) errorMessage += "\n ⚠ Temperature " + t + "F looks like too high (more than 50F); ";
        if (v < 3) errorMessage += "\n  ⚠ Wind speed " + v + "MPH looks like too low (less than 3MPH); ";
        if (v > 110) errorMessage += "\n ⚠ Wind speed " + v + "MPH looks like too high (more than 110MPH); ";

        if (errorMessage.length() > 1) throw new WindTempException(t, v, errorMessage);

        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        String result = "\n⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯"+
                        "\n For temperature "+t+"F and wind speed "+v+"MPH the wind chill is "+w+
                        "\n Reference: https://www.weather.gov/safety/cold-wind-chill-chart"+
                        "\n⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯\n";

        System.out.println(result);

    }

}
