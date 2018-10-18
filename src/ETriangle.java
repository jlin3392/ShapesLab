public class ETriangle extends Shape
{
    private int side;

    /**
     * defines the equilateral triangle and its side length
     * @param side the side length of the triangle
     */
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    @Override
    /**
     * finds the area and returns it
     */
    public double getArea()
    {
        return (Math.sqrt(3)/4*Math.pow(side,2));
    }

    @Override
    /**
     * finds the perimeters and returns it
     */
    public double getPerimeter()
    {
        return side*3;
    }
}
