public class Rectangle extends Shape {

    //These fields define the parameters that the user will enter to calculate the area and perimeter of the rectangle.
    private double height;
    private double width;

    //This constructor inherits the type field from Shape and defines it as Rectangle. The height and width are also set.
    public Rectangle(double height, double width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    //This method is the formula for how to find the area of the rectangle. It multiplies the length and width values inputted before.
    @Override
    public double getArea() {
        return height * width;
    }

    //This formula is the method for how to find the perimeter of the rectangle. It adds the height and width and multiplies that sum by 2.
    @Override
    public double getPerimeter() {
        return (height + width)*2;
    }
}
