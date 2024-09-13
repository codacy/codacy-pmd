Since: PMD 2.2

Reports method and constructor parameters that can be made final because they are never reassigned within the body of the method.

            This rule ignores unused parameters so as not to overlap with the rule {% rule java/bestpractices/UnusedFormalParameter %}.
            It will also ignore the parameters of abstract methods.

Example(s):
```
class Foo {
    // reported, parameter can be declared final
    public String foo1(String param) {
        return param;
    }
    // not reported, parameter is declared final
    public String foo2(final String param) {
        return param.trim();
    }
    // not reported because param is unused
    public String unusedParam(String param) {
        return "abc";
    }
}
```
