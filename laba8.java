import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class laba8 {

    public class Innerlaba8 {
        private int field1;
        private String field2;

        public int methodFirst(int operat1, String operat2){return 3;}

        public String methodSecond(String operat3){return "good";}

        public void methodThird(){}
    }
    
    public static void classInfo(Class<?> class1){
        System.out.println("Имя класса: " + class1.getName());

        System.out.println("Поля: ");
        Field[] fields = class1.getDeclaredFields();
        for(Field field: fields){
            System.out.println( field.getName() + " : " + field.getType().getName());
        }
        System.out.println();

        System.out.println("Методы: ");
        Method[] methods = class1.getDeclaredMethods();
        for(Method method: methods){
            System.out.println(method.getName() + " : " + method.getReturnType().getName());
            System.out.println();
            System.out.println("Параметры метода: ");
            Class<?>[] paramMethod = method.getParameterTypes();
            for(Class<?> paramMethods: paramMethod){
                System.out.println(paramMethods.getName() + " ");
            }
            System.out.println();
        }

        System.out.println("Интерфейс:");
        Class<?>[] interfacesClass = class1.getInterfaces();
        for(Class<?> interfaces: interfacesClass){
            System.out.println(interfaces.getName() + " ");
        }

        System.out.println("Родительский класс: ");
        Class<?> parentClass = class1.getSuperclass();
        if(parentClass != null){
            System.out.println("----" + parentClass.getName() + "----");
        }
    }

    public static void main(String[] arg){
        classInfo(Innerlaba8.class);
    }

}