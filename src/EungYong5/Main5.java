package EungYong5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Main5 {

    interface MyFunction {
        int call(int a, int b);
    }

    public static List<String> getParkList (List<String> names){
        return names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
    }
    public static int deohagi(int a, int b) {
        return a + b;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        nums.stream().forEach(num -> System.out.println(num));
        nums.stream().filter((num) -> num % 2 == 0).forEach(System.out::println); // 짝수

        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(i + 1);
            }
        }
        nums.stream().filter((num) -> num % 2 == 0) // 거르기 2, 4, 6, .... List<Integer>
        .map((num) -> num + "번")//변환 2번 4번 6번 .... .... List<Integer>
                .forEach((num) -> System.out.println(num + 1)); // 무지성 뺑뺑이

        List<String>names = new ArrayList<>();
        names.add("박경덕");
        names.add("박준하");
        names.add("이동학");
        names.add("박태현");
        
        List<String>parks = getParkList(names);
        System.out.println(parks); 
    

        IntBinaryOperator func = Main5::add;
        MyFunction deohagiFunction = Main5::add;
        MyFunction deohagiFunction2 = Main5::deohagi;


        // 람다로 간단하게

        MyFunction addFunction2 = (int a, int b) -> {
            return a + b;
        };
        MyFunction multiFunction2 = (int a, int b) -> {
            return a * b;
        };

        int result = func.applyAsInt(5, 3);

        System.out.println("5+3=" + result);

    }
}
