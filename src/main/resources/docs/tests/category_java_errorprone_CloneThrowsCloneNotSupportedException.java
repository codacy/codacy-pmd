//#Patterns: category_java_errorprone_CloneThrowsCloneNotSupportedException

public class Foo implements Cloneable {

    //#Warn: category_java_errorprone_CloneThrowsCloneNotSupportedException
    public Object clone() {
        Foo clone = (Foo)super.clone();
        return clone;
    }
}

public class MyClass implements Cloneable {

    public Object clone() throws CloneNotSupportedException { 
        MyClass clone = (MyClass)super.clone();
        return clone;
    }
}
