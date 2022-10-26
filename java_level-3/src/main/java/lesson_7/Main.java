package lesson_7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Barsik", 10);

//        Class<Cat> catClass = (Class<Cat>) cat.getClass();
        Class<Cat> catClass1 = Cat.class;

//        Class<?> cClassCat = Class.forName("java.lang.Byte");
        //----Рефлексия-----//
       /* System.out.println(catClass1.getName());
        System.out.println(catClass1.getSimpleName());

        int modifiers = catClass1.getModifiers();
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isInterface(modifiers));

        catClass1.getSuperclass();
        catClass1.getInterfaces();

        Method[] methods = catClass1.getMethods();
        for (Method showMethod : methods) {
            System.out.println("methods: " + showMethod.getName());
        }
        Method[] declaredMethods = catClass1.getDeclaredMethods();
        for (Method declM: declaredMethods){
            System.out.println("declaredMethods: " + declM.getName());
        }
        catClass1.getMethod("info", String.class);

        Field[] fields = catClass1.getFields();
        Field[] declaredFields = catClass1.getDeclaredFields();
        for (Field f: declaredFields){
            System.out.println(f);
        }
        Field age = catClass1.getDeclaredField("age");
        age.setAccessible(true);
        age.set(cat, 13);

        System.out.println(cat);

        Method[] declaredMethods = catClass1.getDeclaredMethods();
        for (Method m: declaredMethods){
            System.out.println(m);
        }*/


        //-----Аннотации-------//

        CatAnnotation catAnnotation = new CatAnnotation("Murzik", "black", 10, 10);
        Class<CatAnnotation> catAnnotationClass = CatAnnotation.class;

        for (Method method: catAnnotationClass.getDeclaredMethods()){
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                if (method.getAnnotation(MyAnnotation.class).priority() > 6) {
                    System.out.println(method.getAnnotation(MyAnnotation.class).priority());
                    method.invoke(catAnnotation);
                }
            }
        }

    }
}
