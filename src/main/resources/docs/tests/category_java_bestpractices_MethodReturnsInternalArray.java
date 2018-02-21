//#Patterns: category_java_bestpractices_MethodReturnsInternalArray

    public class SecureSystem {
        UserData [] ud;
        public UserData [] getUserData() {
            //#Warn: category_java_bestpractices_MethodReturnsInternalArray
            return ud;
        }

        public UserData [] getUserData2() {

            return Arrays.copyOf(ud, ud.length);;
        }
    }
