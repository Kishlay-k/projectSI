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
@Table(name = "DailyEntry")
public class DailyEntry {
    @Id
    @Column(name = "dailyEntryID", nullable = false)
    private Integer dailyEntryID;

    @Column(name = "addedOn", nullable = false)
    private LocalDateTime addedOn;

    @Column(name = "forDay", nullable = false)
    private LocalDate forDay;

}