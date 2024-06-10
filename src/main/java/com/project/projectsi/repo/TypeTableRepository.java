package com.project.projectsi.repo;

import com.project.projectsi.models.TypeTable;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TypeTableRepository extends JpaRepository<TypeTable,Integer> {
    @NonNull
    List<@NonNull TypeTable> findAll();
}
