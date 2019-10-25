package com.example.menuorder;


public class Menu {
    private int menuID;
    private String name;
    private String summary;
    private String content;
    private String price;
    private int imageDrawableId;


    public Menu(int menuID, String name,  String summary, String content, String price, int imageDrawableId) {
        this.menuID = menuID;
        this.name = name;
        this.summary = summary;
        this.content = content;
        this.price = price;


        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }

    public int getMenuID() {
        return menuID;
    }

    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }


    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
