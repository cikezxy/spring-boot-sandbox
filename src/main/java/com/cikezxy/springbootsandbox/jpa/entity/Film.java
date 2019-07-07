package com.cikezxy.springbootsandbox.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "film")
@ToString(exclude = {"inventories", "actors"})
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long filmId;
    private String title;
    private String description;

    private String releaseYear;
    private Long languageId;
    private Long originalLanguageId;
    private Long rentalDuration;
    private BigDecimal rentalRate;
    private Long length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;

    @JsonIgnore
    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    private List<Inventory> inventories;

    @ManyToMany
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors;
}
