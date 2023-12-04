import java.lang.reflect.*;

public class Main {
    public static void swapValues(Object obj1, Object obj2) {
        try {
            Field[] fields = obj1.getClass().getDeclaredFields();
            for (java.lang.reflect.Field field : fields) {
                field.setAccessible(true);
                Object temp =  field.get(obj1);
                field.set(obj1, field.get(obj2));
                field.set(obj2, temp);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MyClass my_1 = new MyClass(5);
        MyClass my_2 = new MyClass(10);
        System.out.println("Исходные:");
        System.out.println(my_1.myInt);
        System.out.println(my_2.myInt);
        swapValues(my_1, my_2);
        System.out.println("С обменом:");
        System.out.println(my_1.myInt);
        System.out.println(my_2.myInt);
    }
}
