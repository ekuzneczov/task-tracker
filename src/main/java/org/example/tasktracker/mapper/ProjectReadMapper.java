package org.example.tasktracker.mapper;

import org.example.tasktracker.database.entity.ProjectEntity;
import org.example.tasktracker.dto.ProjectReadDto;
import org.springframework.stereotype.Component;

@Component
public class ProjectReadMapper implements Mapper<ProjectEntity, ProjectReadDto> {

    @Override
    public ProjectReadDto map(ProjectEntity object) {
        return ProjectReadDto.builder()
                .id(object.getId())
                .name(object.getName())
                .createdAt(object.getCreatedAt())
                .updatedAt(object.getUpdatedAt())
                .build();
    }
}
