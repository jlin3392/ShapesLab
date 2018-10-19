public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1 = new Rectangle (10, 10);
        Shape shape2 = new ETriangle(12);
        Shape shape3 = new Circle(5);
        Shape shape4 = new IsoTriangle(10, 12);
        Shape shape5 = new Ellipse(6, 7);


        Shape[] shapes = {shape1, shape2, shape3, shape4, shape5};

        for (Shape cur : shapes)
        {
            if ((cur.getPerimeter() / 4) * (cur.getPerimeter() / 4) == cur.getArea())
            {
                System.out.println("I am a Square.");
                System.out.println("My area is: " + cur.getArea());
                System.out.println("My perimeter is: " + cur.getPerimeter());
            }
            else
            {
                System.out.println(cur);
                System.out.println("My area is: " + cur.getArea());
                System.out.println("My perimeter is: " + cur.getPerimeter());
            }
        }
    }
}
