//#Patterns: category_java_multithreading_AvoidThreadGroup
public class Foo {
    public void bar() {

//#Warn: category_java_multithreading_AvoidThreadGroup
		ThreadGroup tg = new ThreadGroup("My threadgroup") ;
//#Warn: category_java_multithreading_AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group");
//#Warn: category_java_multithreading_AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup();
//#Warn: category_java_multithreading_AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup();

    }
}

