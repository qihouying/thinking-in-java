package com.dream.initialization;

/** Within a class, the order of initialization is determined by the order that the variable are defined within the class.
 * the variable are initialized before any methods can be called-even the constructor
 *
 * Created by dream on 08/04/2017.
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
