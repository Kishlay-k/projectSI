package com.project.projectsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaRepositories(basePackages = "com.project.projectsi.repo")
@EntityScan("com.project.*")
@SpringBootApplication
public class ProjectSiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSiApplication.class, args);
    }

}
