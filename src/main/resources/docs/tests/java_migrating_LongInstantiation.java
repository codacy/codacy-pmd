//#Patterns: java_migrating_LongInstantiation
public class Foo {
    //#Info: java_migrating_LongInstantiation
    private Long i = new Long(0);
    // change to Long i = Long.valueOf(0);

}