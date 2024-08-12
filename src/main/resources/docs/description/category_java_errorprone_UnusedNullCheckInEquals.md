Since: PMD 3.5

After checking an object reference for null, you should invoke equals() on that object rather than passing
it to another object's equals() method.

Example(s):
```
public class Test {

    public String method1() { return "ok";}
    public String method2() { return null;}

    public void method(String a) {
        String b;
        // I don't know it method1() can be "null"
        // but I know "a" is not null..
        // I'd better write a.equals(method1())

        if (a!=null && method1().equals(a)) { // will trigger the rule
            //whatever
        }

        if (method1().equals(a) && a != null) { // won't trigger the rule
            //whatever
        }

        if (a!=null && method1().equals(b)) { // won't trigger the rule
            //whatever
        }

        if (a!=null && "LITERAL".equals(a)) { // won't trigger the rule
            //whatever
        }

        if (a!=null && !a.equals("go")) { // won't trigger the rule
            a=method2();
            if (method1().equals(a)) {
                //whatever
            }
        }
    }
}
```
