package homework.homework05;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {


    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phoneArr = new ArrayList<>();
            phoneArr.add(phoneNum);
            phoneBook.put(name, phoneArr);
        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> temp = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return temp;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
