class SwitchExpressions {

    int fn1(int n) {
        final int k = 4;
        var r = switch (n) {
            case 1, 2, 3 + 3, k, C, SC1.C -> 3 + SC1.C;
            case 20 -> 3 + 4 + C - k;
        };
        return r;
    }

    String fn2(String s) {
        return switch (s) {
            //case null -> "n";
            case "a" -> "";
            case "b", "c" -> "a";
            default -> "o";
        };
    }

    int fn3(final int var) {
        return switch (var) {
            case 1 -> 2;
            default -> var;
        };
    }

    void fn4() {

        fn1(switch (1) {
            case 1 -> 0;
            case 2 -> 2;
            default -> 1;
        });
    }

    int fn5() {
        E1 e = E1.ONE;
        return switch (e) {
            case ONE -> 0;
            //default -> 1;
        };
    }

    void fn6() {
        switch (1) {
            case 1 -> {

            }
        }
    }

    
}
