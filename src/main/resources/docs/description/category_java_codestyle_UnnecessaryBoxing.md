Since: PMD 7.0.0

Reports explicit boxing and unboxing conversions that may safely be removed,
            either because they would be inserted by the compiler automatically,
            or because they're semantically a noop (eg unboxing a value to rebox it immediately).

            Note that this only handles boxing and unboxing conversions occurring through
            calls to `valueOf` or one of the `intValue`, `byteValue`, etc. methods. Casts
            that command a conversion are reported by {% rule UnnecessaryCast %} instead.

Example(s):
```
{
        // Instead of
        Integer integer = Integer.valueOf(2);
        // you may just write
        Integer integer = 2;

        int i = integer.intValue(); // similarly for unboxing

        // Instead of
        int x = Integer.valueOf("42");
        // you may just write
        int x = Integer.parseInt("42");
}
```
