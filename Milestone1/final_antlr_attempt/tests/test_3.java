package example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@interface Dummy {
}

@interface Dummy2 {
}

@Target({ElementType.TYPE, ElementType.TYPE_USE})
@interface Dummy3 {
}

public class test_3 {
    // Interface
}
