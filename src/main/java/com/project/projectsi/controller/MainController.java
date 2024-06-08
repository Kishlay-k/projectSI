package com.project.projectsi.controller;

import com.project.projectsi.models.DailyEntry;
import com.project.projectsi.service.DailyEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SuppressWarnings("SameReturnValue")
@RestController
public class MainController {

    private final DailyEntryService dailyEntryService;

    @Autowired
    public MainController(DailyEntryService dailyEntryService){
        this.dailyEntryService = dailyEntryService;
    }

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @GetMapping("/todaysEntry")
    @ResponseBody
    public DailyEntry getTodayEntry(@RequestParam("forDay") String day){
        LocalDate time = LocalDate.parse(day);
        return dailyEntryService.findDailyEntryByForDay(time);
    }
}
