//#Patterns: category_java_bestpractices_ReplaceEnumerationWithIterator
//#Warn: category_java_bestpractices_ReplaceEnumerationWithIterator
public class Foo implements Enumeration {
    private int x = 42;

    public boolean hasMoreElements() {
        return true;
    }

    public Object nextElement() {
        return String.valueOf(i++);
    }

}
