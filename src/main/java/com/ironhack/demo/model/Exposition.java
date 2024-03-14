package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "exposition")
public class Exposition extends Event{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExposition;

    public Exposition(){}

    public Exposition(Date dateEvent, double duration, String location, String title, List<Member> guests) {
        super(dateEvent, duration, location, title, guests);
    }

    public Integer getIdExposition() {
        return idExposition;
    }

}
