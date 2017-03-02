//#Patterns: java_basic_OverrideBothEqualsAndHashcode

public class Bar {		// poor, missing a hashcode() method

    //#Warn: java_basic_OverrideBothEqualsAndHashcode
    public boolean equals(Object o) {
        // do some comparison
    }
}

public class Baz {		// poor, missing an equals() method

    //#Warn: java_basic_OverrideBothEqualsAndHashcode
    public int hashCode() {
        // return some hash value
    }
}

public class Foo {		// perfect, both methods provided
    public boolean equals(Object other) {
        // do some comparison
    }
    public int hashCode() {
        // return some hash value
    }
}