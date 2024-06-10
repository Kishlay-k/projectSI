package com.project.projectsi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TypeTable")
public class TypeTable {
    @Id
    @Column(name = "typeTableID", nullable = false)
    private Integer typeTableID;

    @Column(name = "description", nullable = false)
    private String description;
}
