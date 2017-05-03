Since: PMD 3.6

Do not nest JSF component custom actions inside a custom action that iterates over its body.

Example(s):
```
<html> <body> <ul>
		<c:forEach items='${books}' var='b'>
			<li> <h:outputText value='#{b}' /> </li>
		</c:forEach>
</ul> </body> </html>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-jsp/rules/jsp/basic-jsf.html#DontNestJsfInJstlIteration)
