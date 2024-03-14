package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChapter;
    private String name;
    private String district;
    @ManyToOne
    @JoinColumn(name="id_member")
    private Member president;
    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_member")
    List<Member> members;

    public Chapter(){}

    public Chapter(String name, String district, Member president, List<Member> members) {
        setName(name);
        setDistrict(district);
        setPresident(president);
        setMembers(members);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chapter chapter)) return false;
        return Objects.equals(name, chapter.name) && Objects.equals(district, chapter.district) && Objects.equals(president, chapter.president) && Objects.equals(members, chapter.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, district, president, members);
    }

    public Integer getId() {
        return idChapter;
    }

    public void setId(Integer id) {
        this.idChapter = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
