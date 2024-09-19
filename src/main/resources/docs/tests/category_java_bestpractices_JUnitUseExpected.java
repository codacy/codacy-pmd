//#Patterns: category_java_bestpractices_JUnitUseExpected

import java.lang.Thread;
import org.junit.Test;

public class Foo {
    @Test
    public void foo() throws Throwable {
        TypeSet.Resolver r = new TypeSet.ImplicitImportResolver();
        try {
            r.resolve("PMD");
            //#Warn: category_java_bestpractices_JUnitUseExpected
            fail("Should have thrown an exception");
        } catch (ClassNotFoundException cnfe) {
        }
    }
}
