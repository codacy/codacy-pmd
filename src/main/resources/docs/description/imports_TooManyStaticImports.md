If you overuse the `static import` feature, it can make your program unreadable and unmaintainable, polluting its namespace with all the static members you import. Readers of your code (including you, a few months after you wrote it) will not know which class a `static` member comes from (Sun 1.5 Language Guide).

Ex:

```
import static Lennon;
import static Ringo;
import static George;
import static Paul;
import static Yoko; // Too much !
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/imports.html#TooManyStaticImports)
