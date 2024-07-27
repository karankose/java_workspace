import java.io.*;
class TestInputStream 
{
    public static void main(String arg[])throws IOException
    {
        FileInputStream fin = new FileInputStream("f1.txt");
        int ch;
        while ((ch = fin.read())!=-1) {
            System.out.print((char)ch);           
        }
        fin.close();
    }
}
// reading a data from  a file using FileIutputStream
