// 1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, 
//    Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three 
//    classes.
interface Shape
{
   double getArea();
}
class Rectangle implements Shape
{
    int l;
    int b;
    public Rectangle(int l ,int b)
    {
        this.l = l;
        this.b = b;
    }
    public double getArea()
    {   
        return l*b;
    }
}
class Circle implements Shape
{
    double r;
    public Circle (double r)
    {
        this. r = r;
    }
    public double getArea()
    {
        return  3.14 * r * r;
    }
}
class Triangle
{
    int b;
    int h;
    public Triangle(int b , int h)
    {
        this. b = b ;
        this. h = h;
    }
    public double getArea()
    {
        return 0.5 * b * h;
    }
}
public class Que1 
{
    public static void main(String[] args) 
    {
        Rectangle rr = new Rectangle(12, 52);
        Circle cc = new Circle(51);
        Triangle tt = new Triangle(10, 12);

        System.out.println("area of rectangle : "+rr.getArea());
        System.out.println("area of circle : "+cc.getArea());
        System.out.println("area of triangle : "+tt.getArea());
    }
}

