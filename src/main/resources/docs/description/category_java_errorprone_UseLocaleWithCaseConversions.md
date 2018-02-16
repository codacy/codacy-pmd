Since: PMD 2.0

When doing String.toLowerCase()/toUpperCase() conversions, use Locales to avoids problems with languages that
have unusual conventions, i.e. Turkish.

Example(s):
```
class Foo {
    // BAD
    if (x.toLowerCase().equals("list")) { }

    /*
     * This will not match "LIST" when in Turkish locale
     * The above could be
     * if (x.toLowerCase(Locale.US).equals("list")) { }
     * or simply
     * if (x.equalsIgnoreCase("list")) { }
     */
    // GOOD
    String z = a.toLowerCase(Locale.EN);
}
```
