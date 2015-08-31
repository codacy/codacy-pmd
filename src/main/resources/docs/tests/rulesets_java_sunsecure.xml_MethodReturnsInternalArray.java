//#Patterns: sunsecure_MethodReturnsInternalArray

    public class SecureSystem {
        UserData [] ud;
        public UserData [] getUserData() {
            //#Err: sunsecure_MethodReturnsInternalArray
            return ud;
        }

        public UserData [] getUserData2() {

            return Arrays.copyOf(ud, ud.length);;
        }
    }
