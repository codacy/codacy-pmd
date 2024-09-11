//#Patterns: category_java_bestpractices_JUnitUseExpected

import java.lang.Thread;
import org.junit.Test;

public class MyTest {
    @Test
    public void foo() throws Throwable {
        TypeSet.Resolver r = new TypeSet.ImplicitImportResolver();
        //#Warn: category_java_bestpractices_JUnitUseExpected
        try {
            r.resolve("PMD");
            fail("Should have thrown an exception");
        } catch (ClassNotFoundException cnfe) {
        }
    }
}
