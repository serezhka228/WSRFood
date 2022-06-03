package com.example.wsrfood;

public class MenuItem {
    private String name;
    private int price;
    private int iconResource;

    public MenuItem(String name, int price, int iconResource) {
        this.name = name;
        this.price = price;
        this.iconResource = iconResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }
}
