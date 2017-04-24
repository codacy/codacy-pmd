Since: PMD 3.7

Avoid duplicate import statements inside JSP's.

Example(s):
```
<%@ page import=\"com.foo.MyClass,com.foo.MyClass\"%><html><body><b><img src=\"<%=Some.get()%>/foo\">xx</img>text</b></body></html>
```
