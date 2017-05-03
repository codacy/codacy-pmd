Since: PMD 5.6.0

Avoid calling VF action upon page load as the action becomes vulnerable to CSRF.

Example(s):
```
<apex:page controller="AcRestActionsController" action="{!csrfInitMethod}" >
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-visualforce/rules/vf/security.html#VfCsrf)
