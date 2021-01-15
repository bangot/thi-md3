package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
    private int id;
    private String name;
     private  int price;
     private int total;
     private String color;
     private String desc;
     private int category_id;

    public Product(int id, String name, int price, int total, String color, String desc, int category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
        this.color = color;
        this.desc = desc;
        this.category_id = category;
    }

    public Product(String name, int price, int total, String color, String desc, int category_id) {
        this.name = name;
        this.price = price;
        this.total = total;
        this.color = color;
        this.desc = desc;
        this.category_id = category_id;
    }
    public Product(ResultSet resultSet) {
        try {
            this.id       = resultSet.getInt("id");
            this.name     = resultSet.getString("name");
            this.price    = resultSet.getInt("price");
            this.total    = resultSet.getInt("total");
            this.color    = resultSet.getString("color");
            this.desc     = resultSet.getString("desc");
            this.category_id = resultSet.getInt("category");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}