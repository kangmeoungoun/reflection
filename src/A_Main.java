/**
 * Created by jojoldu@gmail.com on 2020-12-14
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class A_Main extends B_Extends{
    public static void main(String[] args) {
        A_Main a_main = new A_Main();
        a_main.better();
    }

    @Override
    public void test() {

    }

    @Override
    public void better() {
        System.out.println("then better");
    }
}
