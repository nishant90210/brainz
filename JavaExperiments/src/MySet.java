package src;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by abhijeet on 9/25/16.
 */
public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] array = {2, 3, 1, 1, 4};
        for (int i : array) {
            set.add(i);
        }
        for(int i : set) {
            System.out.println(i);
        }
    }
}
