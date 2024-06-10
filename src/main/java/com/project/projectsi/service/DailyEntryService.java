package com.project.projectsi.service;

import com.project.projectsi.models.DailyEntry;
import com.project.projectsi.models.DailyIndividualEntry;
import com.project.projectsi.repo.DailyEntryRepository;
import com.project.projectsi.repo.DailyIndividualEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DailyEntryService {
    private final DailyEntryRepository dailyEntryRepository;
    private final DailyIndividualEntryRepository dailyIndividualEntryRepository;

    @Autowired
    public DailyEntryService(DailyEntryRepository dailyEntryRepository, DailyIndividualEntryRepository dailyIndividualEntryRepository){
        this.dailyEntryRepository = dailyEntryRepository;
        this.dailyIndividualEntryRepository = dailyIndividualEntryRepository;
    }

    public DailyEntry findDailyEntryByForDay(LocalDate forDay){
        return dailyEntryRepository.findByForDay(forDay);
    }

    public List<DailyIndividualEntry> findDailyIndividualEntriesByID(LocalDate forDay){
        DailyEntry dailyEntry = findDailyEntryByForDay(forDay);
        Long dailyEntryID = dailyEntry.getDailyEntryID();
        return dailyIndividualEntryRepository.findByID(dailyEntryID);
    }
}
