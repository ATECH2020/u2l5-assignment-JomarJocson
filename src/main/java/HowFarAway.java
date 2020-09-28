import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double distance;
        double sLat;
        double sLon;
        double eLat;
        double eLon;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        sLat = scanner.nextDouble();

        System.out.print("\n" + "Enter the longitude of the starting location: ");
        sLon = scanner.nextDouble();

        System.out.print("\n" + "Enter the latitude of the ending location: ");
        eLat = scanner.nextDouble();
    
        System.out.print("\n" + "Enter the longitude of the ending location: ");
        eLon = scanner.nextDouble();

        GeoLocation sGeoLocation = new GeoLocation(sLat,sLon);
        GeoLocation eGeoLocation = new GeoLocation(eLat,eLon);
        distance = sGeoLocation.distanceFrom(eGeoLocation);

        System.out.println("The distance is " + distance + " miles");
    }
}