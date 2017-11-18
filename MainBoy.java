/*
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MainBoy{

    String[] Titles = new String[5];
    int[] TitleN = new int[5505945];
    private static final File file = new File("randomWiki.txt"); //find file

    public static void main(String[] args)
    {
        String[] Titles = new String[5505945];
        int[] TitleN = new int[5505945];
        setArrays();
        getArrayAt;
    }
    public void setArrays()
    {
       try
        {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine())
            {
                Titles[i] = scan.nextLine();
            }
            for (int i = 0; i < 5505944; i++
            {
                TitleN[i] = i;
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();//meme here please
        }
    }
    public String getArrayAt(int a )
    {
        String retString = "Title: ";
        retString += Titles[i] ;
        retString += "  Title Number: ";
        retString += TitleN[i];
        return retString;
    }
}
