package com.loftschool.moneytracker;

import java.io.Serializable;

public class Item implements Serializable {
    static final String TYPE_EXPENSE = "expense";
    static final String TYPE_INCOME = "income";

    final int price;
    public int id = -1;
    public String name;
    String type;

    Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
