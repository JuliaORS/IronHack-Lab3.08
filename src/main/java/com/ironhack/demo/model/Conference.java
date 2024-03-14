package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "conference")
public class Conference extends Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConference;
    @ManyToMany
    @JoinTable(
            name = "conference_speaker",
            joinColumns = @JoinColumn(name = "id_conference"),
            inverseJoinColumns = @JoinColumn(name = "id_speaker")
    )
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(Date dateEvent, double duration, String location, String title, List<Member> guests) {
        super(dateEvent, duration, location, title, guests);
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
