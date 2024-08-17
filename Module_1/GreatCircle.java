public class GreatCircle {
    /* Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2 —
    the latitude and longitude (in degrees) of two points on the surface of the earth—and prints the great-circle distance (in kilometers) between them. Use the following Haversine formula */
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
        double s1 = Math.sin((x2 - x1) / 2);
        double s2 = Math.sin((y2 - y1) / 2);
        double sqrt = Math.sqrt(Math.pow(s1, 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(s2, 2));
        double distance = (2 * r * Math.asin(sqrt));
        System.out.println(distance + " Kilometers");
    }
}
