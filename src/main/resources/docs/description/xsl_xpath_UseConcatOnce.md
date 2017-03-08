Since: PMD 5.0

The XPath concat() functions accepts as many arguments as required so you can have "concat($a,'b',$c)" rather than "concat($a,concat('b',$c)".

Example(s):
```
<xsl:variable name="var" select="concat("Welcome",concat("to you ",$name))"/>
 <xsl:variable name="var" select="concat("Welcome","to you ",$name))">
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-xml/rules/xsl/xpath.html#UseConcatOnce)
