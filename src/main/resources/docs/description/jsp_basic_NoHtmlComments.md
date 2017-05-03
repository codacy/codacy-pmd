Since: PMD 3.6

In a production system, HTML comments increase the payload
			between the application server to the client, and serve
			little other purpose. Consider switching to JSP comments.

Example(s):
```
<HTML><title>bad example><BODY>
<!-- HTML comment -->
</BODY> </HTML>

<HTML><title>good example><BODY>
<%-- JSP comment --%>
</BODY> </HTML>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-jsp/rules/jsp/basic.html#NoHtmlComments)
