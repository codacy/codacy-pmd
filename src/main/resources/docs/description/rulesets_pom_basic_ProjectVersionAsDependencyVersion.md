Since: PMD 5.4

Using that expression in dependency declarations seems like a shortcut, but it can go wrong.
By far the most common problem is the use of 6.0.0-SNAPSHOT in a BOM or parent POM.

Example(s):
```
<project...>
  ...
  <dependency>
    ...
    <version>${project.dependency}</version>
  </dependency>
</project>
```
