package homework.homework05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String name1;
//        String name2;
//        String name3;
//        String name4;
//        int phone1;
//        int phone2;
//        int phone3;
//
//        name1 = "Ivanov";
//        name2 = "Petrov";
//        name3 = "Sidorov";
//        name4 = "Cviridova";
//        phone1 = 333333;
//        phone2 = 555555;
//        phone3 = 777777;
//
//        PhoneBook myPhoneBook = new PhoneBook();
//        myPhoneBook.add(name1, phone1);
//        myPhoneBook.add(name1, phone2);
//        myPhoneBook.add(name2, phone2);
//        myPhoneBook.add(name1, phone3);
//        myPhoneBook.add(name2, phone2);
//        myPhoneBook.add(name3, phone1);
//        myPhoneBook.add(name4, phone1);
//
//        System.out.println(myPhoneBook.find(name1));
//        System.out.println(PhoneBook.getPhoneBook());
//        System.out.println(myPhoneBook.find("Me"));

//        String name1;
//        String name2;
//        String name3;
//        String name4;
//        String name5;
//
//        name1 = "Ivan";
//        name2 = "Elena";
//        name3 = "Ivan";
//        name4 = "Elena";
//        name5 = "Ivan";
//
//        NamesCounter namesCounter = new NamesCounter();
//
//        namesCounter.addName(name1);
//        namesCounter.addName(name2);
//        namesCounter.addName(name3);
//        namesCounter.addName(name4);
//
//        namesCounter.addName(name5);
//
//        namesCounter.showNamesOccurrences();

        int[] initArray;

        initArray = new int[]{17, 32, 1, 4, 25, -17, 0, 3, 10, 7, 64, 1};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }

}

