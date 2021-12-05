import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Day1P1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("PuzzleInput1.txt");
        Scanner in = new Scanner(myFile);
        int previous = Integer.parseInt(in.nextLine());
        int counter = 0;

        while (in.hasNext()){
            int current = Integer.parseInt(in.nextLine());
            if (current > previous)
            {
                counter++;
            }
            previous = current;
        }

        System.out.println("Amount of Increasing: " + counter + "\n");
        in.close();
    }
}