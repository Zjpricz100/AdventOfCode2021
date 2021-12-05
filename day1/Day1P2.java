import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Day1P2 {
    public static void main(String[] args) throws FileNotFoundException
    {
        File myFile = new File("PuzzleInput1.txt");
        Scanner in = new Scanner(myFile);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (in.hasNext()){
            list.add(Integer.parseInt(in.nextLine()));
        }

        int prevSum = list.get(0) + list.get(1) + list.get(2);
        int currentSum;
        int count = 0;
        for (int i = 0; i < list.size() - 2; i++)
        {
            currentSum = list.get(i) + list.get(i+1) + list.get(i+2);
            if (currentSum > prevSum) { count++; }
            prevSum = currentSum;
        }
        System.out.println(count);
    }
}
