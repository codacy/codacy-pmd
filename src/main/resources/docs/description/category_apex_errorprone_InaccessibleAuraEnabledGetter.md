Since: PMD 6.36.0

In the Summer '21 release, a mandatory security update enforces access modifiers on Apex properties in
Lightning component markup. The update prevents access to private or protected Apex getters from Aura
and Lightning Web Components.

Example(s):
```
public class Foo {
    @AuraEnabled
    public Integer counter { private get; set; } // Violating - Private getter is inaccessible to Lightning components

    @AuraEnabled
    public static Foo bar()
    {
        Foo foo = new Foo();
        foo.counter = 2; 
        return foo;
    }
}

        

public class Foo {
    @AuraEnabled
    public Integer counter { protected get; set; } // Violating - Protected getter is inaccessible to Lightning components

    @AuraEnabled
    public static Foo bar()
    {
        Foo foo = new Foo();
        foo.counter = 2; 
        return foo;
    }
}

        

public class Foo {
    @AuraEnabled
    public Integer counter { get; set; } // Compliant - Public getter is accessible to Lightning components

    @AuraEnabled
    public static Foo bar()
    {
        Foo foo = new Foo();
        foo.counter = 2; 
        return foo;
    }
}
```
