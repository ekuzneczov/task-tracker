package org.example.tasktracker.database.repository;

import org.example.tasktracker.database.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskEntityRepository extends JpaRepository<TaskEntity, Long> {


}
