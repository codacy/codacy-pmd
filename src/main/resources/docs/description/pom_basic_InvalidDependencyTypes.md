Since: PMD 5.4

While Maven will not failed if you use an invalid type for a dependency in the dependency management section, it will not also uses the dependency.

Example(s):
```
<project...>
  ...
  <dependencyManagement>
      ...
    <dependency>
      <groupId>org.jboss.arquillian</groupId>
      <artifactId>arquillian-bom</artifactId>
      <version>${arquillian.version}</version>
      <type>bom</type> <!-- not a valid type ! 'pom' is ! -->
      <scope>import</scope>
    </dependency>
    ...
  </dependencyManagement>
</project>
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-xml/rules/pom/basic.html#InvalidDependencyTypes)
