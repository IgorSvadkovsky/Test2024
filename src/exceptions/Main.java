package exceptions;

import enums.User;

public class Main {
    public static void main(String[] args) throws Exception {


//        var user = new User();
//
//        user = null;
//
//        System.out.println(user != null ? user.getName() : "user is null");


//        System.out.println(someMethod());


//        var resource = new MyResource();
//
//        try {
//            throw new CustomException2("Some custom exception");
//        } finally {
//            try {
//                resource.close();
//            } catch (Exception e) {
//
//            }
//        }

        try (var trueResource = new TrueResource(); var trueResource1 = new TrueResource()) {
            throw new CustomException2("Some custom exception");
        }


    }

    public static int someMethod() {

        try {
//            System.out.println(1 / 0);
//            throw new CustomException();
            // ...
            return 0;
        } catch (Exception e) {
            e.getSuppressed();
            System.out.println("*************");
        } finally {
            System.out.println("Some code after try-catch");
            return 1;
        }
        //

//        return 3;
    }
}

// JUnit
// UserDTO