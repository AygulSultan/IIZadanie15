public class Circul {
    public static final double PI = 3.14;
    public static double circumference;
    private double radius;

    public Circul(double radius) {
        this.radius = radius;
    }

    public static double getCircumference() {
        return circumference;
    }

    public static void setCircumference(double circumference) {
        Circul.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}


