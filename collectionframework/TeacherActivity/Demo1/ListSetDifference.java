import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDifference {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Red"); // Duplicate added
        colorList.add("Blue");
        
        Set<String> colorSet = new HashSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Red"); // Duplicate not added
        colorSet.add("Blue");

        System.out.println("ArrayList (List): " + colorList);
        System.out.println("HashSet (Set): " + colorSet);
    }
}
