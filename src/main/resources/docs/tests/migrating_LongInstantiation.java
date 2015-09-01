//#Patterns: migrating_LongInstantiation
public class Foo {
    //#Warn: migrating_LongInstantiation
    private Long i = new Long(0);
    // change to Long i = Long.valueOf(0);

}