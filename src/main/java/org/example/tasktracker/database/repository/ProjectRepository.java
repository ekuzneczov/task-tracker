package org.example.tasktracker.database.repository;

import org.example.tasktracker.database.entity.ProjectEntity;
import org.example.tasktracker.dto.ProjectReadDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {


    Optional<ProjectEntity> findByName(String name);
}
