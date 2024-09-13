Since: PMD 7.3.0

Wherever possible, use `EnumSet` or `EnumMap` instead of `HashSet` and `HashMap` when the keys
            are of an enum type. The specialized enum collections are more space- and time-efficient.
            This rule reports constructor expressions for hash sets or maps whose key
            type is an enum type.

Example(s):
```
import java.util.EnumMap;
            import java.util.HashSet;

            enum Example {
                A, B, C;

                public static Set<Example> newSet() {
                    return new HashSet<>(); // Could be EnumSet.noneOf(Example.class)
                }

                public static <V> Map<Example, V> newMap() {
                    return new HashMap<>(); // Could be new EnumMap<>(Example.class)
                }
            }
```
