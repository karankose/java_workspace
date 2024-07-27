// 3. Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes
//    Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method
//    for each of the three classes.

interface Flyable
{
    void fly_obj();
}
class SpaceCraft implements Flyable
{
    public void fly_obj()
    {
        System.err.println("spacecraft fly");
    }
}
class Airplane implements Flyable{
    public void fly_obj()
    {
        System.out.println("airplane is fly");
    }
}
class Helicopter implements Flyable
{
    public void fly_obj()
    {
        System.out.println("helicopter fly");
    }
}
public class Que3 
{
    public static void main (String arg[])
    {
        // SpaceCraft ss = new SpaceCraft();
        // ss.fly_obj();
        // Airplane aa = new Airplane();
        // aa.fly_obj();
        // Helicopter hh = new Helicopter();
        // hh.fly_obj();
        // both are correct
        Flyable [] fly = { new Airplane(), new Helicopter(), new SpaceCraft()};
        for (Flyable obj : fly) {
            obj.fly_obj();
        }
    }    
}
