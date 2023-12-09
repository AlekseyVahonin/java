package homework.homework05;

import java.util.HashMap;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    public void addName(String name) {
        int count = 1;
        if (names.containsKey(name)) {
            count = names.get(name) + 1;
            names.put(name, count);
        } else {
            names.putIfAbsent(name, 1);
        }
    }

    public void showNamesOccurrences() {
        System.out.println(names);
    }
}
