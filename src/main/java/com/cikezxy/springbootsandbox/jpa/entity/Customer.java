package com.cikezxy.springbootsandbox.jpa.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "customer")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    private long storeId;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private byte active;
    private Date createDate;
    private Date lastUpdate;
}
