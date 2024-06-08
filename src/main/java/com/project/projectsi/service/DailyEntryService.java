package com.project.projectsi.service;

import com.project.projectsi.models.DailyEntry;
import com.project.projectsi.repo.DailyEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DailyEntryService {
    private final DailyEntryRepository dailyEntryRepository;

    @Autowired
    public DailyEntryService(DailyEntryRepository dailyEntryRepository){
        this.dailyEntryRepository = dailyEntryRepository;
    }

    public DailyEntry findDailyEntryByForDay(LocalDate forDay){
        return dailyEntryRepository.findByForDay(forDay);
    }
}
