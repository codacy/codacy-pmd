Since: PMD 3.6

IFrames which are missing a src element can cause security information popups in IE if you are accessing the page
through SSL. See http://support.microsoft.com/default.aspx?scid=kb;EN-US;Q261188

Example(s):
```
<HTML><title>bad example><BODY>
<iframe></iframe>
</BODY> </HTML>

<HTML><title>good example><BODY>
<iframe src="foo"></iframe>
</BODY> </HTML>
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-jsp/rules/jsp/basic.html#IframeMissingSrcAttribute)
