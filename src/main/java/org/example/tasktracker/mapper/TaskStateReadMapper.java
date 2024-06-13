package org.example.tasktracker.mapper;

import org.example.tasktracker.database.entity.TaskStateEntity;
import org.example.tasktracker.dto.TaskStateReadDto;
import org.springframework.stereotype.Component;

@Component
public class TaskStateReadMapper implements Mapper<TaskStateEntity, TaskStateReadDto> {


    @Override
    public TaskStateReadDto map(TaskStateEntity object) {
        return TaskStateReadDto.builder()
                .id(object.getId())
                .name(object.getName())
                .createdAt(object.getCreatedAt())
                .build();
    }

}
