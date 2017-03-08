Since: PMD 1.5

A suspicious octal escape sequence was found inside a String literal.
The Java language specification (section 3.10.6) says an octal
escape sequence inside a literal String shall consist of a backslash
followed by:

   OctalDigit | OctalDigit OctalDigit | ZeroToThree OctalDigit OctalDigit

Any octal escape sequence followed by non-octal digits can be confusing,
e.g. "\038" is interpreted as the octal escape sequence "\03" followed by
the literal character "8".

Example(s):
```
public void foo() {
  // interpreted as octal 12, followed by character '8'
  System.out.println("suspicious: \128");
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#SuspiciousOctalEscape)
