Since: PMD 5.5.0

Global classes should be avoided (especially in managed packages) as they can never be deleted or changed in signature. Always check twice if something needs to be global.
Many interfaces (e.g. Batch) required global modifiers in the past but don't require this anymore. Don't lock yourself in.

Example(s):
```
global class Unchangeable {
    global UndeletableType unchangable(UndeletableType param) {
        // ...
    }
}
```
