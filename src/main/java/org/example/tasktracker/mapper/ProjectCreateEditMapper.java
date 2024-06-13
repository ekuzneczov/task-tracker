package org.example.tasktracker.mapper;

import org.example.tasktracker.database.entity.ProjectEntity;
import org.example.tasktracker.dto.ProjectCreateEditDto;
import org.springframework.stereotype.Component;

@Component
public class ProjectCreateEditMapper implements Mapper<ProjectCreateEditDto, ProjectEntity> {


    @Override
    public ProjectEntity map(ProjectCreateEditDto object) {
        return ProjectEntity.builder()
                .name(object.getName())
                .build();
    }
}
