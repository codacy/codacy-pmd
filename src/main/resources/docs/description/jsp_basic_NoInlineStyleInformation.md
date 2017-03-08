Since: PMD 3.6

Style information should be put in CSS files, not in JSPs. Therefore, don't use &lt;B> or &lt;FONT> tags, or attributes like "align='center'".

Example(s):
```
<html><body><p align='center'><b>text</b></p></body></html>
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-jsp/rules/jsp/basic.html#NoInlineStyleInformation)
