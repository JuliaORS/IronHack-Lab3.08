package com.ironhack.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGuest;
    private String name;
    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    public Guest(){}

    public Guest(String name, GuestStatus status) {
        setName(name);
        setStatus(status);
    }

    public Integer getIdGuest() {
        return this.idGuest;
    }

    public void setIdGuest(Integer idGuest) {
        this.idGuest = idGuest;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return this.status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }
}
