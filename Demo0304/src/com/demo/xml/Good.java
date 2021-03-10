package com.demo.xml;

public class Good {
    private String id;
    private String Name;
    private String firm;
    private double price;

    public Good() {
    }

    public Good(String id, String name, String firm, double price) {
        this.id = id;
        Name = name;
        this.firm = firm;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", firm='" + firm + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
