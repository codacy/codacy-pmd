Since: PMD 3.5

Instead of manually copying data between two arrays, use the more efficient `Arrays.copyOf`
or `System.arraycopy` method instead.

To copy only part of the array, use `Arrays.copyOfRange` or `System.arraycopy`.

If you want to copy/move elements inside the _same_ array (e.g. shift the elements), use `System.arraycopy`.

Example(s):
```
class Scratch {
    void copy_a_to_b() {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        // equivalent
        b = Arrays.copyOf(a, a.length);
        // equivalent
        System.arraycopy(a, 0, b, 0, a.length);

        int[] c = new int[10];
        // this will not trigger the rule
        for (int i = 0; i < c.length; i++) {
            b[i] = a[c[i]];
        }
    }
}

        

class Scratch {
    void shift_left(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        // equivalent
        System.arraycopy(a, 1, a, 0, a.length - 1);
    }
    void shift_right(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        // equivalent
        System.arraycopy(a, 0, a, 1, a.length - 1);
    }
}
```
