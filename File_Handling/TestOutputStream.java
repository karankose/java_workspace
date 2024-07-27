import java.io.*;

class TestOutputStream
{
    public static void main (String ar[])throws IOException
    {
        FileOutputStream fout = new FileOutputStream("f1.txt");
        String S = "java is a class based partially object oriented programming language";
        byte arr[] = S . getBytes();
        fout.write(arr);
        fout.close();
        System.out.println("data insert successfully in the file");

    }
}
// writing a data into a file using FileOutputStream