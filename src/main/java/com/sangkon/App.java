package com.sangkon;

import com.sangkon.ds.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        System.out.println(linkedList);
    }
}
