In most cases, the Logger reference can be declared as static and final.


public class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());					// not recommended

    static final Logger log = Logger.getLogger(Foo.class.getName());	// preferred approach
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-java.html#LoggerIsNotStaticFinal)
