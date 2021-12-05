import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Day2P1 {
    public static void main(String[] args) throws FileNotFoundException
    {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;


        File myFile = new File("PuzzleInput2.txt");
        Scanner in = new Scanner(myFile);

        ArrayList<Order> orders = new ArrayList<Order>();
        while (in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            orders.add(new Order(s1, Integer.parseInt(s2)));
        }
        in.close();

        /* PART 1 :)
        for (Order o : orders)
        {
            if (o.getDirection().equals("forward"))
            {
                horizontal += o.getAmount();
            }
            else if (o.getDirection().equals("down"))
            {
                depth += o.getAmount();
            }
            else
            {
                depth -= o.getAmount();
            }
        }

        System.out.println("Horizontal: " + horizontal);
        System.out.println("Depth: " + depth);
        System.out.println("Final Pos: " + (horizontal * depth));
        */

        for (Order o : orders)
        {
            String direction = o.getDirection();
            int amount = o.getAmount();

            if (direction.equals("down"))
            {
                aim += amount;
            }
            else if (direction.equals("up"))
            {
                aim -= amount;
            }
            else
            {
                horizontal += amount;
                depth = depth + (aim * amount);
            }
        }
        System.out.println("Horizontal: " + horizontal);
        System.out.println("Depth: " + depth);
        System.out.println("Final Pos: " + (horizontal * depth));


    }

    
}
