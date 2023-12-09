package filter;


import filter01.Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int countLaptop = 10;
        int[] ram = {4, 8, 12, 16, 34, 64};
        int[] price = {10_000, 20_000, 50_000, 60_000, 100_000};
        String[] color = {"черный", "белый", "красный"};
        Boolean[] gamingLaptop = {true, false};
        String[] os = {"Windows 10", "Windows 11", "Linux"};
        String[] name = {"DEXP Aquilon", "HUAWEI MateBook", "ASUS Vivobook Go"};

        Set<Laptop> laptops = addLaptop(countLaptop, ram, price, color, gamingLaptop, os, name);
        printSet(laptops);
        filter(laptops, mainInterface(os));
    }

    static Map<String, Object> mainInterface(String[] os) {

        Map<String, Object> criteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int action;
        boolean flag = true;

        while (flag) {
            System.out.println("""
                    Выберите параметр фильтра:
                    1. ОЗУ
                    2. Цена
                    3. Цвет
                    4. Игровой ноутбук
                    5. Операционная система
                    6. Поиск""");

            action = scanner.nextInt();

            if (action == 1) {
                System.out.println("Введите минимальное количество ОЗУ");
                criteria.put("ОЗУ", scanner.nextInt());
            } else if (action == 2) {
                System.out.println("Введите минимальную цену");
                criteria.put("Цена", scanner.nextInt());
            } else if (action == 3) {
                System.out.println("Введите цвет");
                criteria.put("Цвет", scanner.next().toLowerCase());
            } else if (action == 4) {
                System.out.println("Введите да или нет");
                String gamingLaptop = scanner.next().toLowerCase();
                if (gamingLaptop.equals("да")) {
                    criteria.put("Игровой ноутбук", true);
                } else if (gamingLaptop.equals("нет")) {
                    criteria.put("Игровой ноутбук", false);
                }
            } else if (action == 5) {
                boolean flag2 = true;
                while (flag2) {
                    System.out.println("Выберите операционную систему");
                    for (int i = 0; i < os.length; i++) {
                        System.out.println(i + 1 + ". " + os[i]);
                    }
                    System.out.println(os.length + 1 + ". " + "Выйти");
                    int gamingLaptop = scanner.nextInt() - 1;
                    if (gamingLaptop >= 0 && gamingLaptop < os.length) {
                        criteria.put("Операционная система", os[gamingLaptop]);
                        flag2 = false;
                    } else if (gamingLaptop == os.length) {
                        flag2 = false;
                    }
                }
            } else if (action == 6) {
                flag = false;
            }
            printMap(criteria);
        }
        return criteria;
    }

    static void filter(Set<Laptop> laptops, Map<String, Object> criteria) {
        for (Laptop laptop : laptops) {
            if (criteria.containsKey("ОЗУ") &&
                    laptop.getRam() < (Integer) criteria.get("ОЗУ")) {
                continue;
            }
            if (criteria.containsKey("Цена") &&
                    laptop.getPrice() < (Integer) criteria.get("Цена")) {
                continue;
            }
            if (criteria.containsKey("Цвет") &&
                    !laptop.getColor().equals((String) criteria.get("Цвет"))) {
                continue;
            }
            if (criteria.containsKey("Игровой ноутбук") &&
                    laptop.getGamingLaptop() != (Boolean) criteria.get("Игровой ноутбук")) {
                continue;
            }
            if (criteria.containsKey("Операционная система") &&
                    !laptop.getOs().equals((String) criteria.get("Операционная система"))) {
                continue;
            }
            System.out.println(laptop);
        }
    }

    static Set<Laptop> addLaptop(int countLaptop, int[] ram, int[] price, String[] color,
                                 Boolean[] gamingLaptop, String[] os, String[] name) {
        Laptop[] laptopArr = new Laptop[countLaptop];
        Random rnd = new Random();
        Set<Laptop> laptopSet = new HashSet<>();

        for (int i = 0; i < countLaptop; i++) {
            laptopArr[i] = new Laptop();
            laptopArr[i].setRam(ram[rnd.nextInt(0, ram.length)]);
            laptopArr[i].setPrice(price[rnd.nextInt(0, price.length)]);
            laptopArr[i].setColor(color[rnd.nextInt(0, color.length)]);
            laptopArr[i].setGamingLaptop(gamingLaptop[rnd.nextInt(0, gamingLaptop.length)]);
            laptopArr[i].setOs(os[rnd.nextInt(0, os.length)]);
            laptopArr[i].setName(name[rnd.nextInt(0, name.length)]);

            laptopSet.add(laptopArr[i]);
        }
        return laptopSet;
    }

    static void printSet(Set<Laptop> laptopSet) {
        System.out.println("===================================================");
        System.out.println("Все ноутбуки\n");
        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }
        System.out.println("===================================================");
    }

    static void printMap(Map<String, Object> criteria) {
        System.out.println("===================================================");
        System.out.println("Выбранные критерии:");
        for (Map.Entry<String, Object> entry : criteria.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " - " + value);
        }
        System.out.println("===================================================");
    }

}
