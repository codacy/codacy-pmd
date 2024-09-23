Since: PMD 7.0.0

Due to Objective-C and Swift interoperability some functions are often required to be implemented but
            aren't really needed. It is extremely common that the sole implementation of the functions consist of throwing
            a fatal error. Marking these functions as unavailable prevents them from being executed while still making
            the compiler happy.

Example(s):
```
required init?(coder _: NSCoder) { // violation, no unavailable attribute added to the function declaration
    fatalError("init(coder:) has not been implemented")
}

@available(*, unavailable)         // no violation
required init?(coder _: NSCoder) {
    fatalError("init(coder:) has not been implemented")
```
