//#Patterns: category_java_codestyle_CallSuperInConstructor

public class Foo extends Bar {
    
    //#Warn: category_java_codestyle_CallSuperInConstructor
    public Foo() {  

    }
}

public class Foo1 extends Bar {
    public Foo() {
        super();
    }
}
