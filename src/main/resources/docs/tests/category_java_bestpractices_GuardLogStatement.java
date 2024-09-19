//#Patterns: category_java_bestpractices_GuardLogStatement
public class Foo {
    private static final Logger logger = Logger.getLogger(Foo.class);
    private void foo() {
        String a = "2";
        //#Warning: category_java_bestpractices_GuardLogStatement
        logger.debug("Debug statement" + a);
    }
}
