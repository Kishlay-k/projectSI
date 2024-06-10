package com.project.projectsi.service;

import com.project.projectsi.models.TypeTable;
import com.project.projectsi.repo.TypeTableRepository;
import lombok.Data;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TypeTableService {
    private final TypeTableRepository typeTableRepository;

    public TypeTableService(TypeTableRepository typeTableRepository){
        this.typeTableRepository = typeTableRepository;
    }

    private List<TypeTable> typeTableData;

    @Scheduled(fixedRateString = "60000")
    private void init(){
        typeTableData = typeTableRepository.findAll();
    }

}
