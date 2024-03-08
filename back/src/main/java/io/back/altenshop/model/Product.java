package io.back.altenshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombock et on utilise une annotation
@Entity
public class Product {

    public Product(){

    }
    public Product(long id, String code, String name, String description, Double price, Number quantity, String inventoryStatus, String category, String image, Number rating) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.inventoryStatus = inventoryStatus;
        this.category = category;
        this.image = image;
        this.rating = rating;

    }
     @Id
    private long id;
    private String code;
    private String name;
    private String description;
    private Double price;
    private Number quantity;
    private  String inventoryStatus;
    private  String category;
    private  String image;
    private  Number rating;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Number getRating() {
        return rating;
    }

    public void setRating(Number rating) {
        this.rating = rating;
    }


}
