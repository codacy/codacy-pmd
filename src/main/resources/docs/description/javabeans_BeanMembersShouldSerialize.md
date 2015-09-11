If a class is a `bean`, or is referenced by a bean directly or indirectly it needs to be serializable. Member variables need to be marked as `transient`, `static`, or have accessor methods in the class. Marking variables as `transient` is the safest and easiest modification. Accessor methods should follow the Java naming conventions, i.e. for a variable named `foo`, `getFoo()` and `setFoo()` accessor methods should be provided.

Ex:

```
private transient int someFoo;  // good, it's transient
private static int otherFoo;    // also OK
private int moreFoo;            // OK, has proper accessors, see below
private int badFoo;             // bad, should be marked transient

private void setMoreFoo(int moreFoo){
  this.moreFoo = moreFoo;
}

private int getMoreFoo(){
  return this.moreFoo;
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/javabeans.html#BeanMembersShouldSerialize)
