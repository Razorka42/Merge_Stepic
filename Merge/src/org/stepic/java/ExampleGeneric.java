package org.stepic.java;

import java.util.Optional;

public class ExampleGeneric <X> {
    public void someMethod(Object obj) {
        Optional<X> opt = Optional.empty();
        X a = (X) obj;
    }
}
