package homework.homework04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LLTasks {
    public List<Object> revert(LinkedList<Object> ll) {
        List<Object> result = new ArrayList<>(ll.size());
        while (!ll.isEmpty()) {
            result.add(ll.pollLast());
        }
        return result;
    }
}
