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
 * Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 * The wind chill formula is only valid if the wind speed
 * is above 3MPH and below 110MPH and the temperature is below 50 degrees
 * Fahrenheit and above -50 degrees. Modify your solution to print an error
 * message if the user types in a value outside the allowable range.
 *
 *************************************************************************/
public class WindTempException extends Exception
{
	public WindTempException(long t, long v, String message)
	{
		System.out.println("Sorry, could not calculate! Please review your inputs ("+t+","+v+"):  "+message);
	}
}
