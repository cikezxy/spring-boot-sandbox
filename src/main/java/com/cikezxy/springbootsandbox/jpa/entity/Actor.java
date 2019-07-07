package com.cikezxy.springbootsandbox.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "actor")
@ToString(exclude = "films")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    @JsonIgnore
    @ManyToMany(mappedBy = "actors")
    private List<Film> films;

}
