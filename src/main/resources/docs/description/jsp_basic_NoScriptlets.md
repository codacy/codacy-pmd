Since: PMD 3.6

Scriptlets should be factored into Tag Libraries or JSP	declarations, rather than being part of JSP pages.

Example(s):
```
<HTML>
<HEAD>
<%
response.setHeader("Pragma", "No-cache");
%>
</HEAD>
	<BODY>
		<jsp:scriptlet>String title = "Hello world!";</jsp:scriptlet>
	</BODY>
</HTML>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-jsp/rules/jsp/basic.html#NoScriptlets)
