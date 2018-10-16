public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        super("Rectangle");
        this.height = height;
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
