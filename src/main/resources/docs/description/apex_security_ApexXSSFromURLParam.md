Since: PMD 5.5.3

Makes sure that all values obtained from URL parameters are properly escaped / sanitized
to avoid XSS attacks.

Example(s):
```
public without sharing class Foo {
    String unescapedstring = ApexPage.getCurrentPage().getParameters.get('url_param');
    String usedLater = unescapedstring;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/security.html#ApexXSSFromURLParam)
