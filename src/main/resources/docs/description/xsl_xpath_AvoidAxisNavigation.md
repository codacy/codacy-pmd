Since: PMD 5.0

Avoid using the 'following' or 'preceeding' axes whenever possible, as these can cut through 100% of the document in the worst case.  Also, try to avoid using 'descendant' or 'descendant-self' axes, as if you're at the top of the Document, it necessarily means cutting through 100% of the document.

Example(s):
```
<xsl:variable name="var" select="//item/descendant::child"/>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-xml/rules/xsl/xpath.html#AvoidAxisNavigation)
