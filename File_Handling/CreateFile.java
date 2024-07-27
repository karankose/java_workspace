import java.io.*;
class CreateFile
{
    public static void main(String arg [])throws IOException
    {
        File file = new File("f1.txt");
        if (file.createNewFile())
        {
            System.out.println("create a file successfully");
        }
        else
        {
            System.out.println("file is already exist");
        }
    }
}