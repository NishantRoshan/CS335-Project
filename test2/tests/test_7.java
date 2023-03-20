class Func{
    Function<Integer, String> f7(Object obj) {
        boolean b = true;
        boolean b2 = true;
        return switch (obj) {
            case (((String s) && (b && b2)) && s.length() > 0 && dummy() == 1) -> t -> s;
            case (((Integer i && b && b2) && (b && b2)) && b3 && (b && b2 && !b3)) -> {
                yield t -> "";
            }
            case final Long l && (b ? b2 : b3) -> {
                yield t -> "";
            }
            default -> t -> "Default string";
        };
    }
}
