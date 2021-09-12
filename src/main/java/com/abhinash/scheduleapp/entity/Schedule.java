package com.abhinash.scheduleapp.entity;


import javax.persistence.*;

@Entity
@Table
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String checkIn;

    private String firstBreak;

    private String lunch;

    private String secondBreak;

    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getFirstBreak() {
        return firstBreak;
    }

    public void setFirstBreak(String firstBreak) {
        this.firstBreak = firstBreak;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getSecondBreak() {
        return secondBreak;
    }

    public void setSecondBreak(String secondBreak) {
        this.secondBreak = secondBreak;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
