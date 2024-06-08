package com.project.projectsi.repo;

import com.project.projectsi.models.DailyEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DailyEntryRepository extends JpaRepository<DailyEntry, Long> {
    List<DailyEntry> findByForDay(LocalDate forDay);
}
