public class Circle extends Shape
{
    private int radius;

    /**
     * defines the shape to be a circle and its radius
     * @param radius radius of the circle
     */
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    /**
     * finds the area of the circle
     * @return the area of the circle
     */
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    /**
     * finds the circumference of the circle
     * @return the circumference of the circle
     */
    @Override
    public double getPerimeter()
    {
        return Math.PI * 2 * radius;
    }
}
