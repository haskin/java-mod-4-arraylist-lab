import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Problems:
 * x Create a method called mergeTwoArrayLists which takes in two ArrayLists as inputs, l1 and l2. 
 * x Collect the positive elements from the lists into a new ArrayList and return it.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> postiveOnly = new ArrayList<>();
        l1.stream().filter(number -> number.compareTo(0) > 0).forEach(postiveOnly::add);
        l2.stream().filter(number -> number.compareTo(0) > 0).forEach(postiveOnly::add);
        return postiveOnly;
    }
}
