import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by jojoldu@gmail.com on 2020-12-13
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public class functionalInterfaceTest {
    public static void main(String[] args) {
        //매개값은 있고, 리턴값은 없음
        Consumer<Long> consumer = str -> System.out.println(str);
        consumer.accept(100l);
        //매개값은 없고, 리턴값은 있음
        Supplier supplier = () -> {
            return 3;
        };
        System.out.println(supplier.get());;

        Function<String,Integer> function  = (a)->{
            return Integer.valueOf(a);
        };

        Integer apply = function.apply("123");
        System.out.println(apply.getClass().toString());




    }
}
