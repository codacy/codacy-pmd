//#Patterns: java_sunsecure_ArrayIsStoredDirectly
    public class Foo {
        private String [] x;

        //#Err: java_sunsecure_ArrayIsStoredDirectly
        public void foo (String [] param) { //wrong

            this.x = param;
        }

        public void foo2 (String [] param) { //right

            this.x = Arrays.copyOf(param, param.length);
        }
    }