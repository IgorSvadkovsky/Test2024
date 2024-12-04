package lambdas;

import collections.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("123");
        strList.add("1234");
        strList.add("12345");
        strList.add("123456789");

        System.out.println("initial list = " + strList);
        System.out.println("processed list = " + filter(strList, e -> e.length() <= 5));

        Set<User> usersSet = new HashSet<>();

        var user1 = new User(1, 10, "a");
        var user2 = new User(2, 25, "b");
        var user3 = new User(3, 17, "c");
        var user4 = new User(4, 36, "e");

        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user4);
        usersSet.add(user3);

        System.out.println("initial set = " + usersSet);
        System.out.println("processed set = " + filter(usersSet, e -> e.getAge() >= 18));
    }

    public static <T> List<T> filter(Collection<T> collection, Function<T, Boolean> predicate) {
        List<T> resultList = new ArrayList<>();

        for (T el : collection) {
            if(predicate.apply(el)) {
                resultList.add(el);
            }
        }

        return resultList;
    }
}
