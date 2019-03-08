package ac.za.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<String> stringList  = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            stringList.add("String Number: " + (i + 1));
            System.out.println(stringList.get(i));
        }

        HashMap<String, Integer> studentDetails = new HashMap<>();

            studentDetails.put("King", 1);
            studentDetails.put("Stone", 5);
            studentDetails.put("Lion", 9);
            studentDetails.put("Bob", 3);

            System.out.println(" ");
            System.out.println(studentDetails.get("Lion"));

        Collection<String> stringSet = new HashSet<>();
        for (int i = 0; i < 40; i++)
        {
            stringSet.add("Set: " + (i + 1));
        }
        System.out.println(stringSet.size());


    }
}
