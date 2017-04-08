package com.dream.initialization.order;

/**
 * Created by dream on 08/04/2017.
 */
public class House {
    Window window1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
