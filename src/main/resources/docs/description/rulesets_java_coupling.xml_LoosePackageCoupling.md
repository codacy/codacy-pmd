Avoid using classes from the configured package hierarchy outside of the package hierarchy, except when using one of the configured allowed classes.
Packages are a really important way to organize the code. Respecting the hierarchy will enhance the project readability.

Ex:

    package some.package;

    import some.other.package.subpackage.subsubpackage.DontUseThisClass;

    public class Bar {
       DontUseThisClass boo = new DontUseThisClass();
    }

[SOURCE](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/coupling.html#LoosePackageCoupling)
