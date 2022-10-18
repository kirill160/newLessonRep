package com.company.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxStorageTest {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1));
        list.add(new HeavyBox(2));
        list.add(new HeavyBox(10));
        BoxStorage b = new BoxStorage(list);
        System.out.println(b);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
