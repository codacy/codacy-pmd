//#Patterns: controversial_CallSuperInConstructor

public class Foo extends Bar {
    
    //#Err: controversial_CallSuperInConstructor
    public Foo() {  

    }
}

public class Foo1 extends Bar {
    public Foo() {
        super();
    }
}
