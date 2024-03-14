package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMember;
    private String name;
    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private Date renewalDate;

    public Member(){}

    public Member(String name, MemberStatus status, Date renewalDate) {
        setName(name);
        setStatus(status);
        setRenewalDate(renewalDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return status == member.status && Objects.equals(name, member.name) && Objects.equals(renewalDate, member.renewalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, renewalDate);
    }

    public Integer getId() {
        return idMember;
    }

    public void setId(Integer id) {
        this.idMember = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return this.status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
