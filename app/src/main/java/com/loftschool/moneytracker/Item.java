package com.loftschool.moneytracker;

class Item {
    static final String TYPE_EXPENSE = "expense";
    static final String TYPE_INCOME = "income";

    final String name;
    final int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
