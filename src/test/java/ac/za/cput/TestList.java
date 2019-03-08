package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestList {

    @Test
    public void name() {
    }

    @Test
    public void createEmptyArrayList()
    {
        // When crating a ArrayList size should be == 0
        List<String> stringList  = new ArrayList<>();

        Assert.assertEquals(0, stringList.size());

        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
        Assert.assertEquals(3, stringList.size());
        Assert.assertEquals("Test", stringList.get(0));
    }

    @Test
    public void createHashMap()
    {
        HashMap<String, Integer> studentDetails = new HashMap<>();

        studentDetails.put("Aderito", 215278739);
        studentDetails.put("Zacarias", 937872512);

        int result = studentDetails.get("Aderito");
        Assert.assertEquals(215278739, result);

    }

    @Test
    public void createHashSet()
    {
        Collection<String> stringSet = new HashSet<>();

        for (int i = 0; i < 5; i++)
        {
            stringSet.add("StringTest" + i);
        }

        Assert.assertEquals(5, stringSet.size());
        Assert.assertEquals(734669035, stringSet.hashCode());

        // Restart Set
        stringSet.clear();
        Assert.assertEquals(0, stringSet.size());


    }

}
