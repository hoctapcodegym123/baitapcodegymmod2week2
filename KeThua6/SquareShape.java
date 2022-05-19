package KeThua6;

public class SquareShape extends RectangleShape {
    public SquareShape() {
    }

    public SquareShape(double side) {
        super(side, side);
    }

    public SquareShape(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        SquareShape square = new SquareShape();
        System.out.println(square);

        square = new SquareShape(2.3);
        System.out.println(square);

        square = new SquareShape(5.8, "yellow", true);
        System.out.println(square);
    }
}
