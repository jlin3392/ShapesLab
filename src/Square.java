public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}