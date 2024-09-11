//#Patterns: category_java_errorprone_UnusedNullCheckInEquals

public class Test {
    public String bar() {
        return "ok";
    }

    public String method1() {
        return null;
    }

    public void method2(String a) {
        
        //#Warn: category_java_errorprone_UnusedNullCheckInEquals
        if (a != null && bar().equals(a)) {  }
        //#Warn: category_java_errorprone_UnusedNullCheckInEquals
        if (bar().equals(a) && a != null) {  }
    }
}
