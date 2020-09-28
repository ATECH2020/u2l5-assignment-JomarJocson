import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double lat1;
        double long1;
        double lat2;
        double long2;
        
        System.out.println("Enter the latitude of the starting location: ");
        sLat = scanner.nextDouble();

        System.out.println("Enter the longitude of the starting location: ");
        sLon = scanner.nextDouble();

        System.out.println("Enter the latitude of the ending location: ");
        eLat = scanner.nextDouble();
    
        System.out.println("Enter the longitude of the ending location: ");
        eLon = scanner.nextDouble();

        GeoLocation myGeoLocation = new GeoLocation(8.0,11.0,taxRate);

        System.out.println("The distance is " + + " miles");
    }
}