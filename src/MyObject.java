/**
 * Created by jojoldu@gmail.com on 2020-11-23
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class MyObject {

    @StringInject("My name is kmo")
    private String name;

    @StringInject
    private String id;

    private String test;
    @StringInject
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
