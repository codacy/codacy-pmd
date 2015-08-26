Normally only one logger is used in each class.

Ex:

public class Foo {
    Logger log = Logger.getLogger(Foo.class.getName());
    // It is very rare to see two loggers on a class, normally
    // log information is multiplexed by levels
    Logger log2= Logger.getLogger(Foo.class.getName());
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-java.html#MoreThanOneLogger)
