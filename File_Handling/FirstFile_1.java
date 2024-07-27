import java.io.*;
class FirstFile_1
{
    public static void main(String[] args) 
    {
        try
        {
        File file = new File("f1.txt");
        if (file.createNewFile())
            {
                System.out.println("first create create successfully");
            }
        else{
            System.out.println("file is already exist");
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}