import java.util.Arrays;
import java.util.HashMap;

public class AnagramicGroupsCount {
    public static int countAnagramicGroups(String[] words) {
        HashMap<String, Integer> groupMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            groupMap.put(sortedWord, groupMap.getOrDefault(sortedWord, 0) + 1);
        }

        return groupMap.size();
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        int numberOfGroups = countAnagramicGroups(words);
        System.out.println("Number of anagramic groups: " + numberOfGroups);
    }
}