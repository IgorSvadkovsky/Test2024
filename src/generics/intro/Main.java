package generics.intro;

public class Main {
    public static void main(String[] args) {
        CustomArray<String> customArray = new CustomArray<>(10);
        CustomArray<Integer> customArray1 = new CustomArray<>(10);

        customArray.add("text1");
//        customArray.add(123);
        customArray.add("text2");

        String element = customArray.get(1);

        System.out.println(element);
    }
}
