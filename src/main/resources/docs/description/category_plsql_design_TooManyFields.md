Since: PMD 5.1

Classes that have too many fields can become unwieldy and could be redesigned to have fewer fields,
possibly through grouping related fields in new objects.  For example, a class with individual
city/state/zip fields could park them within a single Address field.

Example(s):
```
CREATE OR REPLACE PACKAGE pkg_too_many_fields AS
    C_CHAR_A CONSTANT CHAR(1 CHAR) := 'A';
    C_CHAR_B CONSTANT CHAR(1 CHAR) := 'B';
    ...
    C_CHAR_Z CONSTANT CHAR(1 CHAR) := 'Z';
END pkg_too_many_fields;
```
