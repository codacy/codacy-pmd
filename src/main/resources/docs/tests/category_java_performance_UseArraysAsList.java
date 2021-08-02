//#Patterns: category_java_performance_UseArraysAsList
import java.util.ArrayList;
import java.util.List;

public class Test {
    public void foo(Integer[] ints) {
        List<Integer> l= new ArrayList<>(100);
        for (int i=0; i< 100; i++) {
            //#Warn: category_java_performance_UseArraysAsList
            l.add(ints[i]);
        }
        for (int i=0; i< 100; i++) {
            l.add(a[i].toString()); // won't trigger the rule
        }
    }
}
