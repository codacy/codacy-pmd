Since: PMD 5.4

Using that expression in dependency declarations seems like a shortcut, but it can go wrong.
By far the most common problem is the use of ${project.version} in a BOM or parent POM.

Example(s):
```
<project...>
  ...
  <dependency>
    ...
    <version>6.33.0</version>
  </dependency>
</project>
```
