package lectures.lecture03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//       ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 12, 18));
      List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 56, 12, 18));
//        System.out.println(list1.containsAll(list2));
//        list1.removeAll(list2);
//        System.out.println(list1);
//        list1.retainAll(list2);
//        System.out.println(list1);

//        List<String> list1 = Arrays.asList("Hello", "World", "!!!", "4654654");
//        String[] arr = list1.toArray(new String[0]);
//        String[] arr = new String[list1.size()];
//        list1.toArray(arr);
        int mx = Collections.max(list1);
        System.out.println(mx);
        Iterator<Integer> col = list1.iterator();
    }

    public static Object obg(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        }
        return null;
    }
}
