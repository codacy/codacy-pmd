Since: PMD 5.5.3

Reports on calls to `addError` with disabled escaping. The message passed to `addError`
will be displayed directly to the user in the UI, making it prime ground for XSS
attacks if unescaped.

Example(s):
```
public without sharing class Foo {
    Trigger.new[0].addError(vulnerableHTMLGoesHere, false);
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/security.html#ApexXSSFromEscapeFalse)
