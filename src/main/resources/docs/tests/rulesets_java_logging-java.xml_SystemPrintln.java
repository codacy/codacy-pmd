//#Patterns: rulesets_java_logging-java.xml_SystemPrintln
class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());

    public void testA () {

        //#Warn: rulesets_java_logging-java.xml_SystemPrintln
        System.out.println("Entering test");
        // Better use this

        log.fine("Entering test");
    }
}