//#Patterns: basic_AvoidThreadGroup
public class Foo {
    public void bar() {

//#Err: basic_AvoidThreadGroup
		ThreadGroup tg = new ThreadGroup("My threadgroup") ;
//#Err: basic_AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group");
//#Err: basic_AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup();
//#Err: basic_AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup();

    }
}

