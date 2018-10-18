public class Rectangle extends Shape {

    private double height;
    private double width;

    /**
     * Defines the shape to be a rectangle and the values of the height and width
     * @param height of the rectangle
     * @param width of the rectangle
     */
    public Rectangle(double height, double width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * Finds the area of the rectangle by multiplying the height by the width.
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return height * width;
    }

    /**
     * Finds the perimeter of the rectangle by adding the height and width and doubling the sum.
     * @return the perimeter of the rectangle
     */
    @Override
    public double getPerimeter() {
        return (height + width)*2;
    }
}
