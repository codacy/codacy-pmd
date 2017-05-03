Since: PMD 5.5.3

Checks against redirects to user-controlled locations. This prevents attackers from
redirecting users to phishing sites.

Example(s):
```
public without sharing class Foo {
    String unsafeLocation = ApexPage.getCurrentPage().getParameters.get('url_param');
    PageReference page() {
       return new PageReference(unsafeLocation);
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/security.html#ApexOpenRedirect)
