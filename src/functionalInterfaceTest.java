import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //매개값은 있고, 리턴값은 없음
        Consumer<Long> consumer = str -> System.out.println(str);
        consumer.accept(100l);

        //매개값은 없고, 리턴값은 있음
        Supplier supplier = () -> {
            return 3;
        };
        System.out.println(supplier.get());;

        //매개값도 있고 리턴값도 있다. ,주로 매개값을 리턴값으로 매핑(타입변환)
        Function<String,Integer> function  = (a)->{
            return Integer.valueOf(a);
        };
        Integer apply = function.apply("123");
        System.out.println(apply.getClass().toString());
        
        //Operator 매개값도 있고,리턴값도 있다. 주로 매개값을 연산하고 결과를 리턴
        IntBinaryOperator intBinaryOperator = (a,b)-> {return a+b;};
        System.out.println(intBinaryOperator.applyAsInt(10, 20));

        //매개값은 있고 리턴타입은 boolean ,매개값을 조사해서 true/false 를 리턴
        Predicate<String> predicate  = t->{return t.equals("12");};
        System.out.println(predicate.test("12"));
    }
}
