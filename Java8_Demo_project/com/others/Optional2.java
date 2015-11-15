package com.others;

import java.util.Optional;

/**
 * @author khan
 */
public class Optional2 {

    static class Outer {
        Nested nested;
    }

    static class Nested {
        Inner inner;
    }

    static class Inner {
        String foo;
    }

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Optional.of(new Outer())
            .flatMap(o -> Optional.ofNullable(o.nested))
            .flatMap(n -> Optional.ofNullable(n.inner))
            .flatMap(i -> Optional.ofNullable(i.foo))
            .ifPresent(System.out::println);
    }
}
