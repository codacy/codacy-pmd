Since: PMD 3.5

Instead of manually copying data between two arrays, use the efficient System.arraycopy method instead.

Example(s):
```
public class Test {
  public void bar() {
    int[] a = new int[10];
    int[] b = new int[10];
    for (int i=0;i<10;i++) {
      b[i]=a[i];
    }
  }
}
     // this will trigger the rule
     for (int i=0;i<10;i++) {
       b[i]=a[c[i]];
     }

  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/optimizations.html#AvoidArrayLoops)
