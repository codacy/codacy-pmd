//#Patterns: category_java_bestpractices_SystemPrintln
class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());

    public void testA () {

        //#Warn: category_java_bestpractices_SystemPrintln
        System.out.println("Entering test");
        // Better use this

        log.fine("Entering test");
    }
}
