import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static int countDistinctAbsoluteValues(int[] arr) {
        HashSet<Integer> uniqueAbsoluteValues = new HashSet<>();

        for (int num : arr) {
            uniqueAbsoluteValues.add(Math.abs(num));
        }

        return uniqueAbsoluteValues.size();
    }

    public static void main(String[] args) {
        int[] numbers = {-5, -3, 0, 3, 5, 8};
        
        int count = countDistinctAbsoluteValues(numbers);
        System.out.println("Number of distinct absolute values: " + count);
    }
}