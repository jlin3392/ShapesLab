public class IsoTriangle extends Shape
{
    private int base;
    private int height;

    /**
     * defines the isosceles triangle and its measurements
     * @param base the base length of the triangle
     * @param height the height of the triangle
     */
    public IsoTriangle(int base, int height)
    {
        super("IsoTriangle");
        this.base = base;
        this.height = height;
    }
    @Override
    /**
     * finds the area and returns it
     */
    public double getArea()
    {
        return (double)(base*height)/2;
    }

    @Override
    /**
     * finds the perimeter and returns it
     */
    public double getPerimeter()
    {
        return Math.sqrt(Math.pow(base*0.5, 2) + Math.pow(height, 2))*2 + base;
    }
}