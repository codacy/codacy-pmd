Since: PMD 5.1.4

Avoid using expressions without escaping / sanitizing. This could lead to cross site scripting - as the expression
would be interpreted by the browser directly (e.g. &quot;&lt;script&gt;alert('hello');&lt;/script&gt;&quot;).

Example(s):
```
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
${expression}                    <!-- don't use this -->
${fn:escapeXml(expression)}      <!-- instead, escape it -->
<c:out value="${expression}" />  <!-- or use c:out -->
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-jsp/rules/jsp/basic.html#NoUnsanitizedJSPExpression)
