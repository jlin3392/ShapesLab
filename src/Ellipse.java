public class Ellipse extends Shape
{
    private double aAxis;
    private double bAxis;

    public Ellipse(double aAxis, double bAxis)
    {
        super("Ellipse");
        this.aAxis = aAxis;
        this.bAxis = bAxis;
    }
    @Override
    public double getArea()
    {
        return Math.PI * aAxis * bAxis;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * Math.sqrt((aAxis * aAxis + bAxis * bAxis) / 2);
    }
}
