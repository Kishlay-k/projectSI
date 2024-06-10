package com.project.projectsi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DailyIndividualEntry")
public class DailyIndividualEntry {
    @Id
    @Column(name = "dailyIndividualEntryID")
    private Integer dailyIndividualEntryID;

    @Column(name = "dailyEntryID")
    private Integer dailyEntryID;

    @Column(name = "entryType")
    private Integer entryType;
}
