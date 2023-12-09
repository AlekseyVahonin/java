package seminars.seminar06;

import java.util.HashSet;
import java.util.Set;

/*
Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.setName("Барсик");
        cat1.setAge(10);
        cat1.setPoroda("Сфинкс");
        cat1.setOwner("Мария Ивановна");

        Cat cat2 = new Cat();
        cat2.setName("Васька");
        cat2.setAge(9);
        cat2.setPoroda("Дворняга");
        cat2.setOwner("Кирилл Петрович");

        Cat cat3 = new Cat();
        cat3.setName("Машка");
        cat3.setAge(8);
        cat3.setPoroda("Персидская");
        cat3.setOwner("Семен Кириллович");

        Cat cat4 = new Cat();
        cat4.setName("Жорик");
        cat4.setAge(9);
        cat4.setPoroda("Эльф");
        cat4.setOwner("Петя");

        Cat cat5 = new Cat();
        cat5.setName("Жорик");
        cat5.setAge(9);
        cat5.setPoroda("Эльф");
        cat5.setOwner("Петя");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(findByAge(cats, 9));
    }

    static Set<Cat> findByAge(Set<Cat> cats, int minAge){
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats){
            if (cat.getAge() >= minAge){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}