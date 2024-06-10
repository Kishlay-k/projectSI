package com.project.projectsi.repo;

import com.project.projectsi.models.DailyEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface DailyEntryRepository extends JpaRepository<DailyEntry, Long> {
    @Query(value = "select de from DailyEntry de where de.forDay = :forDay")
    DailyEntry findByForDay(@Param("forDay") LocalDate forDay);
}
