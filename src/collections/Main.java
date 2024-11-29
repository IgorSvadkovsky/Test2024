package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        final Integer[] arr = {1, 2, 3};
//        arr[1] = 10;
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = List.of(1, 2, 3);


        List<Integer> lkdList = new LinkedList<>();

        lkdList.add(1);

//        lkdList.get(2); // O(n)

        List<Integer> arrList = new ArrayList<>();

        arrList.add(44);
        arrList.add(5);
        arrList.add(6);
        arrList.add(3);
        arrList.add(2);
        arrList.add(0);
//        arrList.add(5, 5); // O(n)
        // 1, 2, 3, 5, 55, 78, 89

        Iterator<Integer> iterator = arrList.iterator();

        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > 5) {
                iterator.remove();
            }
//            System.out.println(next);
        }

        // Fail Safe / Fail Fast

//        System.out.println(arrList);

//        for (Integer element : arrList) {
//            if (element > 5) {
//                arrList.remove(element);
//            }
//            System.out.println(element);
//        }

//        arrList.get(3); // O(1)

//        Collections.sort(arrList);


        Map<Integer, User> usersMap = new TreeMap<>();

        var user1 = new User(1, 20, "a");
        var user2 = new User(2, 25, "b");
        var user3 = new User(3, 26, "c");
        var user4 = new User(4, 36, "e");

        usersMap.put(user3.getId(), user3); // 3 -> 35 % 16 = 3
        usersMap.put(user1.getId(), user1); // 1 -> 35 % 16 = 3
        usersMap.put(user4.getId(), user4);
        usersMap.put(user2.getId(), user2); // 2 -> 51 % 16 = 3

//        usersMap.put(user1.getId(), user3); // 1 -> 35 % 16 = 3

        // 16 * 0.75 = 12
        // 32 * 0.75 = ..
        // 64 бакета , 8 эл
        // IdentityHashCode

//        System.out.println(usersMap.get(1).getAge());
//        System.out.println(usersMap.getOrDefault(200, user1).getAge());

//        System.out.println(usersMap);

        Set<String> set = new TreeSet<>();

        set.add("89");
        set.add("44");
        set.add("12345");
        set.add("34");

//        System.out.println(set);

        UserComparator userComparator = new UserComparator();

        Set<User> usersSet = new TreeSet<>(userComparator);

        usersSet.add(user4);
        usersSet.add(user2);
        usersSet.add(user1);
        usersSet.add(user3);

//        user1.compareTo(user4);
        userComparator.compare(user1, user4);

        System.out.println(usersSet);

    }
}

// natural ordering == Comparable
