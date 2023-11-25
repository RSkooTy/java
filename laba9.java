import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class laba9 {
    public static void main(String[] args) {
        try {
            String className = "nameClass";
            Class<?> class1 = Class.forName(className);

            Constructor<?> constructorClass = class1.getDeclaredConstructor();
            Object obj = constructorClass.newInstance();

            String methodNameClass = "classMethod";
            Method method = class1.getDeclaredMethod(methodNameClass);
            method.invoke(obj);

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}

class nameClass {
    public void classMethod() {
        System.out.println("complete"  );
    }
}
