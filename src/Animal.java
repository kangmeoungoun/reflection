import java.lang.reflect.InvocationTargetException;

/**
 * Created by jojoldu@gmail.com on 2020-11-23
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class Animal<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> T getanimal(T t) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        t.getClass().getConstructor();
        return t;
    }

}
