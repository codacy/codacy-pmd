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
