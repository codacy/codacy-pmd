Since: PMD 3.9

The dataflow analysis tracks local definitions, undefinitions and references to variables on different paths on the data flow.
From those informations there can be found various problems.

1. DU - Anomaly: A recently defined variable is undefined. These anomalies may appear in normal source text.
2. DD - Anomaly: A recently defined variable is redefined. This is ominous but don't have to be a bug.

Example(s):
```
public void foo() {
  int buz = 5;
  buz = 6; // redefinition of buz -> dd-anomaly
  foo(buz);
  buz = 2;
} // buz is undefined when leaving scope -> du-anomaly
```
