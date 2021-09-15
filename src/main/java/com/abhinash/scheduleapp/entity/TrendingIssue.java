package com.abhinash.scheduleapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trending_issue")
public class TrendingIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ticket_number")
    private String ticketNumber;

    private String description;

    @Column(name = "work_around")
    private String workAround;

    private String comments;

    private String status;

    @Column(name = "reported_date")
    private Date reportedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkAround() {
        return workAround;
    }

    public void setWorkAround(String workAround) {
        this.workAround = workAround;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }
}
