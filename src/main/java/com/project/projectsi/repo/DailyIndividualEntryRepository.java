package com.project.projectsi.repo;

import com.project.projectsi.models.DailyIndividualEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DailyIndividualEntryRepository extends JpaRepository<DailyIndividualEntry, Long> {
    @Query(value = "select die from DailyIndividualEntry die where die.dailyEntryID = :dailyIndividualEntryID")
    List<DailyIndividualEntry> findByID(@Param("dailyIndividualEntryID") Long dailyIndividualEntryID);
}