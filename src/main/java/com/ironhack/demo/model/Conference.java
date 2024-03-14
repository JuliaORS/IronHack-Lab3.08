package com.ironhack.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "conference")
public class Conference extends Event{

    @OneToMany
    @JoinColumn(name="id_speaker")
    private List<Speaker> speakers;
}
