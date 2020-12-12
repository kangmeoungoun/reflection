import java.util.ArrayList;

/**
 * Created by jojoldu@gmail.com on 2020-10-03
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class ReflectCls {
    private String privateStr;
    protected String protectedStr;
    public String publicStr;
    public ReflectCls(){};
    public ArrayList<String> getArrayList(){
        System.out.println("인자 없는 getArrayList");
        return new ArrayList<String>();
    }
    public ArrayList<String> getArrayList(int a){
        System.out.println("인자 있는 getArrayList");
        return new ArrayList<String>();
    }
    public String[] getStringArray(){
        System.out.println("인자 없는 getArrayList");
        return new String[5];
    }
    public int sum( int a, int b ){
        return a+b;
    }
    public static int sub( int a, int b ){
        return a-b;
    }
    private void setStringArray(String[] a){
    }
}
