//#Patterns: migrating_ShortInstantiation

public class Foo {
    //#Warn: migrating_ShortInstantiation
    private Short i = new Short(0);
    // change to Short i = Short.valueOf(0);
}