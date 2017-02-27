//#Patterns: java_basic_AvoidThreadGroup
public class Foo {
    public void bar() {

//#Warn: java_basic_AvoidThreadGroup
		ThreadGroup tg = new ThreadGroup("My threadgroup") ;
//#Warn: java_basic_AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group");
//#Warn: java_basic_AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup();
//#Warn: java_basic_AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup();

    }
}

