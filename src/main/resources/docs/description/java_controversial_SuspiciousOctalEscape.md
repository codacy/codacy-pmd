Since: PMD 1.5

A suspicious octal escape sequence was found inside a String literal.
The Java language specification (section 3.10.6) says an octal
escape sequence inside a literal String shall consist of a backslash
followed by:

   OctalDigit | OctalDigit OctalDigit | ZeroToThree OctalDigit OctalDigit

Any octal escape sequence followed by non-octal digits can be confusing,
e.g. &quot;\038&quot; is interpreted as the octal escape sequence &quot;\03&quot; followed by
the literal character &quot;8&quot;.

Example(s):
```
public void foo() {
  // interpreted as octal 12, followed by character '8'
  System.out.println("suspicious: \128");
}
```
