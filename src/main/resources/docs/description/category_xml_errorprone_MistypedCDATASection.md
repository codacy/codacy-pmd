Since: PMD 5.0

An XML CDATA section begins with a &lt;![CDATA[ marker, which has only one [, and ends with a ]]&gt; marker, which has two ].

Example(s):
```
<root>
    <child>
        <![CDATA[[ character data ]]> - this cdata section is valid, but it contains an
        additional square bracket at the beginning.
        It should probably be just <![CDATA[ character data ]]>.
    </child>
    <child>
        <![CDATA[ character data ]]]> - this cdata section is valid, but it contains an
        additional square bracket in the end.
        It should probably be just <![CDATA[ character data ]]>.
    </child>
</root>
```
