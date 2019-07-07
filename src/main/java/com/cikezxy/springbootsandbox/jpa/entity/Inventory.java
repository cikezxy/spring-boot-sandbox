package com.cikezxy.springbootsandbox.jpa.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long inventoryId;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
    private long storeId;
    private Date lastUpdate;

}
