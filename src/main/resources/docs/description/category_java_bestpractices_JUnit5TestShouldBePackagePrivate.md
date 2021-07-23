Since: PMD 6.35.0

Reports JUnit 5 test classes and methods that are not package-private.
Contrary to JUnit 4 tests, which required public visibility to be run by the engine,
JUnit 5 tests can also be run if they're package-private. Marking them as such
is a good practice to limit their visibility.

Test methods are identified as those which use `@Test`, `@RepeatedTest`,
`@TestFactory`, `@TestTemplate` or `@ParameterizedTest`.

Example(s):
```
class MyTest { // not public, that's fine
    @Test
    public void testBad() { } // should not have a public modifier

    @Test
    protected void testAlsoBad() { } // should not have a protected modifier

    @Test
    private void testNoRun() { } // should not have a private modifier

    @Test
    void testGood() { } // package private as expected
}
```
