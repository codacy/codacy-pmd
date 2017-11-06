Since: PMD 5.0

The XPath concat() functions accepts as many arguments as required so you can have
&quot;concat($a,'b',$c)&quot; rather than &quot;concat($a,concat('b',$c)&quot;.

Example(s):
```
<xsl:variable name="var" select="concat("Welcome",concat("to you ",$name))"/>
<xsl:variable name="var" select="concat("Welcome","to you ",$name))">
```
