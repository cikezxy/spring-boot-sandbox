package com.cikezxy.springbootsandbox.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String address;
    private String address2;
    private String district;
    private long cityId;
    private String postalCode;
    private String phone;
    private String location;
    private Date lastUpdate;
}
