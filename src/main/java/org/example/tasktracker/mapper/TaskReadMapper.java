package org.example.tasktracker.mapper;

import org.example.tasktracker.database.entity.TaskEntity;
import org.example.tasktracker.dto.TaskReadDto;
import org.springframework.stereotype.Component;

@Component
public class TaskReadMapper implements Mapper<TaskEntity, TaskReadDto> {

    @Override
    public TaskReadDto map(TaskEntity object) {
        return TaskReadDto.builder()
                .id(object.getId())
                .name(object.getName())
                .createdAt(object.getCreatedAt())
                .description(object.getDescription())
                .build();
    }
}
