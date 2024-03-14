package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "speaker")
public class Speaker {
    private String name;
    private double presentationDuration;

    public Speaker(){}

    public Speaker(String name, double presentationDuration) {
        setName(name);
        setPresentationDuration(presentationDuration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speaker speakers)) return false;
        return Double.compare(presentationDuration, speakers.presentationDuration) == 0 && Objects.equals(name, speakers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presentationDuration);
    }

    public Integer getId() {
        return idSpeaker;
    }

    public void setId(Integer id) {
        this.idSpeaker = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
