import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by jojoldu@gmail.com on 2020-10-03
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class MainJava2 {
    public static void main(String[] args){
        LamdaI lb = (a,b) -> {
            System.out.println("test");
            return a-b;
        };
        IntStream.range(1,10)
                .forEach(value ->{
                    IntStream.range(1,10)
                            .forEach(value2 ->{
                                int val = value * value2;
                                //System.out.printf("%d * %d = %d\n",value,value2,val);
                            });
                });

        Arrays.stream(new int[]{1,3,5})
                .average()
                .ifPresent(value -> System.out.println(value));
        System.out.println("-----------------------");
        Stream.of("12345","56789","34567")
                .map(s->s.substring(1,3))
                .forEach(s-> System.out.println(s));
        System.out.println("-----------------------");
        Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(value -> Integer.parseInt(value))
                .max()
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        boolean b = Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.printf("map : %s\n", s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.printf("anyMatch %s\n", s);
                    return s.startsWith("A");
                });
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        System.out.println("-----------------------");
        Stream<String> c = myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(s -> s.toUpperCase())
                .sorted();
        c.forEach(System.out::println);
        System.out.println("-----------------------");
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        IntStream.range(1,4)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        Arrays.stream(new int[]{1,3,5})
                .map(value ->2 * value +1)
                .average()
                .ifPresent(System.out::println);
        System.out.println("-----------------------");
        Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(s->Integer.parseInt(s))
                .forEach(System.out::println);
        System.out.println("-----------------------");
        IntStream.range(1,4)
                .mapToObj(i->"a"+i)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        Stream.of(1.0,2.0,3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i->"a"+i)
                .forEach(System.out::println);
        List<String> tt = Arrays.asList("tt","uu");
        List<Map> t1 = new ArrayList<>();
        Map<String,String> uu = Map.of("key01","value01", "key02", "value02");
        t1.add(uu);
        System.out.println(t1.size());
    }
}
