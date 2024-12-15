package pack1;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This program reads files line by line from input.txt, checks if each line is in delete.txt, and if the file is not
// in delete, then it writes the file in output.txt
class WriteDelete
{
    public static boolean function(String target, String name) throws IOException
    {
        Pattern p = Pattern.compile(target);
        FileReader fr = new FileReader(name+".txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null)
        {
            Matcher m = p.matcher(line);
            if (m.find())
            {
                return true;
            }
            line = br.readLine();
        }
        return false;
    }

    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("output.txt");
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null)
        {
            boolean b = function(line, "delete");
            if (b != true)
            {
                System.out.println(line);
            }
            line = br.readLine();
        }
    }
}