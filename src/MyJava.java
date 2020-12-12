import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jojoldu@gmail.com on 2020-10-03
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class MyJava {
    public static void main(String args[]) {

        ReflectCls g2 = new ReflectCls();
        g2.sum(1,4);
        /*
        MyClass myClass = new MyClass();
        String myName = myClass.getMyName();
        System.out.println("my name is "+myName);
        System.out.println("===========================");
        */
        try {
              /*
            Class myClass = Class.forName("MyClass");
            Constructor myConstructor = myClass.getConstructor(new Class[]{String.class});
            Object myObj = myConstructor.newInstance("kmo");

            Method method = myClass.getMethod("getMyName");
            String name = (String) method.invoke(myObj);
            System.out.println("my name is "+name);

            System.out.println("==============");

            Class[] classes = new Class[]{String.class};
            Object[] objects = new Object[]{"KMO"};
            Method method2 = myClass.getMethod("setMyName", classes);
            method2.invoke(myObj,objects);
            String name2 = (String)method.invoke(myObj);
            System.out.println("changed my name is "+name2);

            Method method3 = myClass.getMethod("mySum", int.class, int.class);
            int sum = (int)method3.invoke(myObj,1,2);
            System.out.println("my sum is "+sum);

            Field field = myClass.getDeclaredField("myName");
            field.setAccessible(true);
            field.set(null,"ksbjobj");
            String name3 = (String) field.get(myObj);
            System.out.println("my name is "+name3);


            Method methods [] =myClass.getDeclaredMethods();
            System.out.println("1. DeclardMethods()");
            for(Method method : methods){
                System.out.println("Found method name "+method);
            }
            Method methods2 [] = myClass.getMethods();
            System.out.println("2.getMethods()");
            for(Method method : methods2){
                System.out.println("Found method name "+method);
            }
            Field fields [] =myClass.getDeclaredFields();
            System.out.println("3.getDeclaredFields()");
            for(Field field : fields){
                System.out.println("Found field name "+ field);
            }
            Field fields2 [] = myClass.getFields();
            System.out.println("4.getFields");
            for(Field field : fields2){
                System.out.println("Found field name"+field);
            }
            Method hiddenmethod = myClass.getDeclaredMethod("hiddenMethod");
            System.out.println("Hidden method name is "+hiddenmethod.getName());
            hiddenmethod.setAccessible(true);
            hiddenmethod.invoke(myObj);
              */

            Class<?> cls =Class.forName("ReflectCls");
            Field[] fields = cls.getFields();
            for(Field filed :fields){
                System.out.println(filed.getType().getName() + " : "+filed.getName());
            }
            System.out.println("-----------------------------------");
            Method[] methods = cls.getMethods();
            StringBuffer sb = new StringBuffer();
            for(Method method : methods){
                sb.append(method.getName());

                Class<?>[] argTypes = method.getParameterTypes();
                sb.append("(");
                int size = argTypes.length;
                for (Class<?> argType : argTypes){
                    String argName =argType.getName();
                    sb.append(argName + " val");
                    if(--size!=0){
                        sb.append(",");
                    }
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                sb.append(" : " + returnType.getName());
                System.out.println(sb);
                sb.setLength(0);
            }



            System.out.println("-----------------------------------");

            Constructor constructor2 = cls.getConstructor();
            Object obj2 = constructor2.newInstance();
            Method method2 = cls.getMethod("sum",new Class[]{int.class,int.class});

            Map map = new HashMap();
            map.put("a",1);
            map.put("b",2);
            System.out.println(method2.invoke(obj2,new Object[]{3,1}) +"@@@@@@@@@@@@@@");


            Constructor constructor = cls.getConstructor();
            Object obj = constructor.newInstance();
            //sum 메소드를 가져와서 합 구하기(인자 파라미터 나열)
            Method method = cls.getMethod("sum", int.class, int.class);
            System.out.println(method.invoke(obj,1,2));

            //sum 메소드를 가져와서 합 구하기 (클래스 배열 파라미터)
            Class[] param = {int.class, int.class};
            method = cls.getMethod("sum",param);
            System.out.println(method.invoke(obj,5,2));

            //sum 메소들를 가져와서 합 구하기 (다이렉트)
            method = cls.getMethod("sum", new Class[]{int.class, int.class});
            System.out.println(method.invoke(obj,new Object[]{1,5}));

            //sub static 메소드를 가져와서 차이 구하기
            method = cls.getMethod("sub", int.class, int.class);
            //static 메소드는 클래스 객체가 필요 없다.
            System.out.println(method.invoke(null,3,1));

            //있어도 상관은 없다.
            System.out.println(method.invoke(obj,3,1));
            System.out.println(method.invoke(cls,3,1));

            //오버로딩 - 매개 인자가 없는 메소드 실행하기
            method = cls.getMethod("getArrayList",(Class<?>[])null );
            method.invoke(obj);
            method = cls.getMethod("getArrayList");
            method.invoke(obj);

            //오버로딩 - 매개인자가 있는 메소드 실행하기
            method = cls.getMethod("getArrayList", new Class[]{int.class});
            method.invoke(obj,new Object[]{1});
            ReflectCls c = (ReflectCls)obj;
            System.out.println(c.sum(5,2));
            System.out.println(c.sub(5,2));
            System.out.println(ReflectCls.sub(5,2));
         } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
