//#Patterns: ecmascript_basic_ConsistentReturn

//#Warn: ecmascript_basic_ConsistentReturn
function foo() {
    if (true) {
        return false;
    }
    return;
}
