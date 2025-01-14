package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "exposition")
public class Exposition extends Event{

    public Exposition(){}

    public Exposition(Date dateEvent, double duration, String location, String title, List<Member> guests) {
        super(dateEvent, duration, location, title, guests);
    }


}
