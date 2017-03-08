Since: PMD 3.5

An interface should be used only to characterize the external behaviour of an
implementing class: using an interface as a container of constants is a poor 
usage pattern and not recommended.

Example(s):
```
public interface ConstantsInterface {
   public static final int CONSTANT1=0;
   public static final String CONSTANT2="1";
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#AvoidConstantsInterface)
