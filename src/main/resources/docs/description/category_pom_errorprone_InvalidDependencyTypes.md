Since: PMD 5.4

If you use an invalid dependency type in the dependency management section, Maven doesn't fail. Instead,
the entry is just ignored, which might have the effect, that the wrong version of the dependency is used.

The following types are considered valid: pom, jar, maven-plugin, ejb, war, ear, rar, par.

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
