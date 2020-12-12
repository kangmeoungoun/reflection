import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jojoldu@gmail.com on 2020-11-23
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StringInject {
    String value() default "this is stringijector";
}
