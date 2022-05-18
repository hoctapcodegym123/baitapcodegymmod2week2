package KeThua;

public class CircleShape extends Shape {
    private double radius = 1.0;

    public CircleShape() {
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public CircleShape(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        CircleShape circleShape = new CircleShape();
        System.out.println(circleShape);

        circleShape = new CircleShape(3.5);
        System.out.println(circleShape);

        circleShape = new CircleShape(3.5, "indigo", false);
        System.out.println(circleShape);
    }
}