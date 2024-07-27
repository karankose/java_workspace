interface Laptop
{
    void RAM();
    void GraphicsCard();
    void Storage();
    void Processor();
}
class Asus implements Laptop
{   
    static
    {
        System.out.println("ASUS VIVOBOOK-15");
        System.out.println("------------------------------");
    }
    public void RAM()
    {
        System.out.println("RAM : 16 GB");
    }
    public void Processor()
    {
        System.out.println("Processor : Intel i-5 ");
    }
    public void GraphicsCard()
    {
        System.out.println("GraphicsCard : RTX 650");
    }
    public void Storage()
    {
        System.out.println("Storage  : SSD - 512 GB");
    }
    public void Backlight()
    {
        System.out.println("Backlight : RGB");
    }
}
public class Configration 
{
    public static void main(String[] args) 
    {
        Asus asuslaptop = new Asus();
        asuslaptop.Processor();
        asuslaptop.GraphicsCard(); 
        asuslaptop.Processor();
        asuslaptop.Storage();   
    }    
}
