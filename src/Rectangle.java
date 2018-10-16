public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.height = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width)*2;
    }
}
