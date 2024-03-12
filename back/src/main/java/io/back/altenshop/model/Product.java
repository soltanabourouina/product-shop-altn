package io.back.altenshop.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //annotation pour gerer les méthodes getters, setters, equals, hashCode et toString
@AllArgsConstructor //  annotation pour gerer le constructeur avec tous les arguments
@NoArgsConstructor //le constructeur par défaut
public class Product {

    @Id
    private long id;
    private String code;
    private String name;
    private String description;
    private Double price;
    private Number quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private Number rating;
}
