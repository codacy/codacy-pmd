//#Patterns: ecmascript_bestpractices_ConsistentReturn

//#Warn: ecmascript_bestpractices_ConsistentReturn
function foo() {
    if (true) {
        return false;
    }
    return;
}
