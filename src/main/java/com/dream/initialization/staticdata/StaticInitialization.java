package com.dream.initialization.staticdata;

/** There's only a single piece of storage for a static, regardless of how many objects are created.
 *  If a field is a static primitive and you don't initialize it, it gets the standard initial value for its type.
 *  If it's a reference to an object, the default initailization value is null.
 *
 * Created by dream on 08/04/2017.
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");

        new Cupboard();

        System.out.println("Creating new Cupboard() in main");

        new Cupboard();

        table.f2(1);

        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
