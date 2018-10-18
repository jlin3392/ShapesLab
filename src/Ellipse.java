public class Ellipse extends Shape
{
    private double aAxis;
    private double bAxis;

    /**
     * defines the shape to be an ellipse and the axises of it
     * @param aAxis semi-major axis
     * @param bAxis semi-minor axis
     */
    public Ellipse(double aAxis, double bAxis)
    {
        super("Ellipse");
        this.aAxis = aAxis;
        this.bAxis = bAxis;
    }

    /**
     * finds the area of the ellipse
     * @return area of the ellipse
     */
    @Override
    public double getArea()
    {
        return Math.PI * aAxis * bAxis;
    }

    /**
     * finds the circumference of the ellipse
     * @return circumference of the ellipse
     */
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * Math.sqrt((aAxis * aAxis + bAxis * bAxis) / 2);
    }
}
