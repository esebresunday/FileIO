package pack1;
import java.io.*;
// this program reads files from file1 and file2 and writes them in file3
public class WriteDelete1
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr1 = new FileReader("file1.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        PrintWriter pw = new PrintWriter("file3.txt");
        FileReader fr2 = new FileReader("file2.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        String line1 = br1.readLine();
        String line2 = br2.readLine();
        while(line1 != null && line2 != null)
        {
            pw.println(line1);
            pw.println(line2);
            line1 = br1.readLine();
            line2 = br2.readLine();
        }
        while(line1 != null)
        {
            pw.println(line1);
            line1 = br1.readLine();
        }
        while(line2 != null)
        {
            pw.println(line2);
            line2 = br2.readLine();
        }
        pw.flush();
        pw.close();


    }
}
