Since: PMD 2.0

When doing `String::toLowerCase()/toUpperCase()` conversions, use an explicit locale argument to specify the case
transformation rules.

Using `String::toLowerCase()` without arguments implicitly uses `Locale::getDefault()`.
The problem is that the default locale depends on the current JVM setup (and usually on the system in which
it is running). Using the system default may be exactly what you want (e.g. if you are manipulating strings
you got through standard input), but it may as well not be the case (e.g. if you are getting the string over
the network or a file, and the encoding is well-defined and independent of the environment). In the latter case,
using the default locale makes the case transformation brittle, as it may yield unexpected results on a machine
whose locale has other case translation rules. For example, in Turkish, the uppercase form of `i` is `İ` (U+0130,
not ASCII) and not `I` (U+0049) as in English.

The rule is intended to *force* developers to think about locales when dealing with strings. By taking a
conscious decision about the choice of locale at the time of writing, you reduce the risk of surprising
behaviour down the line, and communicate your intent to future readers.

Example(s):
```
// violation - implicitly system-dependent conversion
if (x.toLowerCase().equals("list")) {}

// The above will not match "LIST" on a system with a Turkish locale.
// It could be replaced with
if (x.toLowerCase(Locale.US).equals("list")) { }
// or simply
if (x.equalsIgnoreCase("list")) { }

// ok - system independent conversion
String z = a.toLowerCase(Locale.ROOT);

// ok - explicit system-dependent conversion
String z2 = a.toLowerCase(Locale.getDefault());
```
