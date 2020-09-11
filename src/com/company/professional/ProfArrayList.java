package com.company.professional;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProfArrayList {
    public static void learn() {
        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(30);
        some_dyn.add(322);
        some_dyn.add(31);
        some_dyn.add(32);
        some_dyn.add(33);
        some_dyn.add(331);
// В ArrayList при добавлении массива, комнандой .add каждый добавленный
// элемент добавляется в коннец массицва и не ограничено добавление
// указано 5 этлеменов, а добавлено 6!!!
        // .clear - eдаляет весь массив
        // .size - длинна массива
        // .remove () - удаление элемента массива, в скобках указывается номер элемента
        for (Integer x : some_dyn) {
            System.out.println(x);
        }

            LinkedList<String> some_name = new LinkedList<>();
            some_name.add("John");
            some_name.add("Karl");
            some_name.add("Lev");

            some_name.add(1, "Alex");
            // добавление строки в нужную позицию массива

            for (String z : some_name) {
                System.out.println(z);
            }
    }
}
