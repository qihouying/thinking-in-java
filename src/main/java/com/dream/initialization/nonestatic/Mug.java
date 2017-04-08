package com.dream.initialization.nonestatic;

/**
 * Created by dream on 09/04/2017.
 */
public class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
