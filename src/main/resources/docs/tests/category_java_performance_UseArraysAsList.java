//#Patterns: category_java_performance_UseArraysAsList

public class Foo {

    public void bar(int[] ints) {
        List l = new ArrayList(10);
        for (int i = 0; i < 100; i++) {
            //#Warn: category_java_performance_UseArraysAsList
            l.add(ints[i]);
        }

        List o = Arrays.asList(ints);
    }

}

