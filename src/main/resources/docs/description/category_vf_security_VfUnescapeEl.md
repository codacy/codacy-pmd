Since: PMD 5.6.0

Avoid unescaped user controlled content in EL as it results in XSS.

Example(s):
```
<apex:outputText value="Potential XSS is {! here }" escape="false" />
```
