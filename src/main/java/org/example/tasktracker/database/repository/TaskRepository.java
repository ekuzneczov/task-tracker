package org.example.tasktracker.database.repository;

import org.example.tasktracker.database.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    

}
