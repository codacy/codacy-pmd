//#Patterns: java_unnecessary_UnusedNullCheckInEquals

public class Foo {
    public String bar() {
        return "ok";
    }

    public String method1() {
        return null;
    }

    public void method2(String a) {
        
        //#Warn: java_unnecessary_UnusedNullCheckInEquals
        if (a != null && bar().equals(a)) {  }

        if (bar().equals(a) && a != null) {  }
    }
}
