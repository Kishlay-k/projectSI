package com.project.projectsi.repo;

import com.project.projectsi.models.DailyEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface DailyEntryRepository extends JpaRepository<DailyEntry, Long> {
    DailyEntry findByForDay(LocalDate forDay);
}
