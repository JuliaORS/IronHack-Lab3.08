package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "event")
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateEvent;
    private double duration;
    private String location;
    private String title;
    @OneToMany
    @JoinColumn(name="id_guest")
    private List<Member> guests;

    public Event(){}

    public Event(Date dateEvent, double duration, String location, String title, List<Member> guests) {
        setDateEvent(dateEvent);
        setDuration(duration);
        setLocation(location);
        setTitle(title);
        setGuest(guests);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return Double.compare(duration, event.duration) == 0 && Objects.equals(dateEvent, event.dateEvent) && Objects.equals(location, event.location) && Objects.equals(title, event.title) && Objects.equals(guests, event.guests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateEvent, duration, location, title, guests);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }

    public double getDuration() {
        return this.duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        title = this.title;
    }

    public List<Member> getGuest() {
        return this.guests;
    }

    public void setGuest(List<Member> guest) {
        this.guests = guest;
    }
}
