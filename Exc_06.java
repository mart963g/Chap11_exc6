package Exc_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exc_06
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int) (Math.random() * 15) + 1);
        }
        System.out.println(list);
        System.out.println(countUnique(list));
    }

    public static int countUnique(List<Integer> list)
    {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return set.size();
    }
}
