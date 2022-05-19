package KeThua6;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volumeCylinder() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return
                "height= " + height +
                        " And " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
    }
}
