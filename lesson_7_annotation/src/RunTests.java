import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.LinkedList;
import Tests.*;

public class RunTests {

    public static void start(Class inputClass) throws InstantiationException, IllegalAccessException, InvocationTargetException {

        Class testsClass = inputClass;
        Object testObject = testsClass.newInstance();
        Method[] methods = testsClass.getDeclaredMethods();
        LinkedList<Method> methodList = new LinkedList<>();
        Method before = null;
        Method after = null;
        for (Method method : methods) {

            if (method.isAnnotationPresent(BeforeSuite.class)) {
                if (before == null) {
                    before = method;
                }
                else {
                    throw new RuntimeException();
                }
            }

            if (method.isAnnotationPresent(AfterSuite.class)) {
                if (after == null) {
                    after = method;
                }
                else {
                    throw new RuntimeException();
                }
            }

            if (method.isAnnotationPresent(Test.class)) {
                methodList.add(method);
            }

        }

        methodList.sort(new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                return o2.getAnnotation(Test.class).priority()-o1.getAnnotation(Test.class).priority();
            }
        });

        methodList.addFirst(before);
        methodList.addLast(after);

        for (Method method : methodList) {
            method.invoke(testObject);
        }
    }
}
