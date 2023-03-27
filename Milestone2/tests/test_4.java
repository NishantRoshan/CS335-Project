public class switch_case {

    String fn1(String s) {
        return switch (s) {
            //case null -> "n";
            case "a" -> "";
            case "b", "c" -> "a";
            default -> "o";
        };
    }

    int fn2(final int var) {
        return switch (var) {
            case 1 -> 2;
            default -> var;
        };
    }

    int fn3() {
        E1 e;
        return switch (e) {
            case ONE -> 0;
            //default -> 1;
        };
    }

    void fn4() {
        switch (1) {
            case 1 -> {

            }
        }
    }
}
