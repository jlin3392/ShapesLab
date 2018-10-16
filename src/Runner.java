public class Runner
{
    public static void main(String[] args)
    {
        Shape shape1 = new Rectangle(, );
        Shape shape2 = new ETriangle();
        Shape shape3 = new Circle();

        Shape[] shapes = {shape1, shape2, shape3};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My perimeter is: " + cur.getPerimeter());
        }
    }
}