//#Patterns: logging-java_SystemPrintln
class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());

    public void testA () {

        //#Warn: logging-java_SystemPrintln
        System.out.println("Entering test");
        // Better use this

        log.fine("Entering test");
    }
}