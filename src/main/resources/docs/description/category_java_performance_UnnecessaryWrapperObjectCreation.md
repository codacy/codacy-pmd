Since: PMD 3.8

Most wrapper classes provide static conversion methods that avoid the need to create intermediate objects
just to create the primitive forms. Using these avoids the cost of creating objects that also need to be 
garbage-collected later.

Example(s):
```
public int convert(String s) {
    int i, i2;

    i = Integer.valueOf(s).intValue();  // this wastes an object
    i = Integer.parseInt(s);            // this is better

    i2 = Integer.valueOf(i).intValue(); // this wastes an object
    i2 = i;                             // this is better

    String s3 = Integer.valueOf(i2).toString(); // this wastes an object
    s3 = Integer.toString(i2);                  // this is better

    return i2;
}
```
