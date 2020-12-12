import java.lang.reflect.InvocationTargetException;

/**
 * Created by jojoldu@gmail.com on 2020-11-23
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        MyObject object = MyContainer.getObject(MyObject.class);
        System.out.println(object.getName());
        System.out.println(object.getId());
        System.out.println(object.getTest());
        System.out.println(object.getNum());


        System.out.println("------------------------");
        Animal<Integer> an = new Animal<>();
        an.getanimal(new MyObject());

    }
}
