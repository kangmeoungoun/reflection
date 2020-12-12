/**
 * Created by jojoldu@gmail.com on 2020-10-03
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class MyClass {
    private static String myName = null;
    public String pubString = null;

    private void hiddenMethod(){
        System.out.println("hello private");
    }
    public MyClass(){

    }
    public int mySum(int a,int b){
        return a+b;
    }
    public MyClass(String myname){
        this.myName = myname;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        MyClass.myName = myName;
    }
}
