Since: PMD 7.0.0

When the character encoding is missing from the XML declaration,
the parser may produce garbled text.

This is completely dependent on how the parser is set up
and the content of the XML file, so it may be hard to reproduce.

Providing an explicit encoding ensures  accurate and consistent
parsing.

Example(s):
```

```
