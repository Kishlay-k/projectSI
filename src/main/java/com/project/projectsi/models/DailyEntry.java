package com.project.projectsi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "dailyentry")
public class DailyEntry {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "addedOn", nullable = false)
    private LocalDateTime addedOn;

    @Column(name = "forDay", nullable = false)
    private LocalDate forDay;

}