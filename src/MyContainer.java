import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by jojoldu@gmail.com on 2020-11-23
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class MyContainer {

    public static <T> T getObject(Class<T> classType) throws IllegalAccessException {
        T instance = createInstance(classType);
        for (Field f : classType.getDeclaredFields()) {
            StringInject annotation = f.getAnnotation(StringInject.class);
            if (annotation != null && f.getType()==String.class) {
                f.setAccessible(true);
                f.set(instance, annotation.value());
            }
        }
        return instance;
    }

    public static <T> T createInstance(Class<T> classType){
        try {
            return classType.getConstructor().newInstance();
        }catch (NoSuchMethodException| IllegalAccessException| InvocationTargetException| InstantiationException e){
            throw new RuntimeException();
        }
    }

}
