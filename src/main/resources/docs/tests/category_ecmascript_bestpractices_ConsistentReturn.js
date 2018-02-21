//#Patterns: category_ecmascript_bestpractices_ConsistentReturn

//#Warn: category_ecmascript_bestpractices_ConsistentReturn
function foo() {
    if (true) {
        return false;
    }
    return;
}
